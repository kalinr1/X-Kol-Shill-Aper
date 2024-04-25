package com.example.xkolshillaper.service;

import com.example.xkolshillaper.event.XNewPostEvent;
import jakarta.annotation.PostConstruct;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v123.backgroundservice.BackgroundService;
import org.openqa.selenium.devtools.v123.backgroundservice.model.ServiceName;
import org.openqa.selenium.devtools.v123.network.Network;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TwitterListenerService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public TwitterListenerService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @PostConstruct
    public void launchPostListener() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("user-data-dir=" + System.getenv("CHROME_TWITTER_PROFILES_PATH"));
        options.addArguments("profile-directory=" + System.getenv("CHROME_TWITTER_PROFILE_NAME"));
        options.addArguments("--remote-debugging-pipe");
        options.addArguments("--remote-debugging-port=45447");

        ChromeDriver driver = new ChromeDriver(options);

        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        String url = "https://twitter.com/notifications";
        driver.get(url);

        devTools.send(BackgroundService.startObserving(ServiceName.NOTIFICATIONS));
        devTools.send(BackgroundService.setRecording(true, ServiceName.NOTIFICATIONS));

        devTools.addListener(BackgroundService.backgroundServiceEventReceived(), event -> {

            String tweetStatusId = event.getInstanceId().replaceAll("tweet-", "");

            System.out.println(event.getInstanceId());

            String tweetMadeByName = event.getEventMetadata().get(0).getValue();
            String tweetContent = event.getEventMetadata().get(1).getValue();

//            System.out.println(tweetMadeByName);
//            System.out.println(tweetContent);

            applicationEventPublisher.publishEvent(new XNewPostEvent(this, tweetContent, tweetMadeByName));
        });
    }

}
