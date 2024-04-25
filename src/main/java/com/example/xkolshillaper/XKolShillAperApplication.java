package com.example.xkolshillaper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.idealized.target.model.TargetInfo;
import org.openqa.selenium.devtools.v123.backgroundservice.BackgroundService;
import org.openqa.selenium.devtools.v123.backgroundservice.model.ServiceName;
import org.openqa.selenium.devtools.v123.network.Network;
import org.openqa.selenium.devtools.v123.emulation.Emulation;
import org.openqa.selenium.devtools.v123.network.model.Request;
import org.openqa.selenium.devtools.v123.serviceworker.ServiceWorker;
import org.openqa.selenium.devtools.v123.serviceworker.model.RegistrationID;
import org.openqa.selenium.devtools.v123.serviceworker.model.ServiceWorkerRegistration;
import org.openqa.selenium.devtools.v123.storage.Storage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SpringBootApplication
public class XKolShillAperApplication {

    public static void main(String[] args) {
        SpringApplication.run(XKolShillAperApplication.class, args);

        /* WITH SPECIFIC PROFILE

//        ChromeOptions options = new ChromeOptions();

//        String profilePath = "C:\\Users\\kruse\\AppData\\Local\\Google\\Chrome\\User Data";
//        String profileName = "Profile 2";
//
//        options.addArguments("user-data-dir=" + profilePath);
//        options.addArguments("profile-directory=" + profileName);
//        options.addArguments("--remote-debugging-pipe");

//        ChromeDriver driver = new ChromeDriver(options);



//        driver.get("https://twitter.com/");
//
//        DevTools devTools = driver.getDevTools();
//
//        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//
////        devTools.send(BackgroundService.startObserving(ServiceName.NOTIFICATIONS));
//
//        devTools.addListener(BackgroundService.backgroundServiceEventReceived(), event -> {
//            System.out.println(event.getInstanceId());
//        });


        devTools.createSession();


         */

        /*
        WITH REGULAR SELENIUM
         */

//        Map<String, Object> prefs = new HashMap<>();
//
//        prefs.put("profile.default_content_setting_values.notifications", 1);
//
//        ChromeOptions options = new ChromeOptions();
//
//        options.setExperimentalOption("prefs", prefs);
//        options.addArguments("--disable-cache");
//
//        ChromeDriver driver = new ChromeDriver(options);
//
//        DevTools devTools = driver.getDevTools();
//        devTools.createSession();
//
//
//
//        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//

//

//        devTools.addListener(Network.requestServedFromCache(), requestId -> {
//            System.out.println(requestId.toString());
//        });
//
//        devTools.addListener(Network.dataReceived(), dataReceived -> {
//            System.out.println(dataReceived.getData());
//        });
//
//        devTools.addListener(Network.responseReceived(), responseReceived -> {
//            System.out.println(responseReceived.getResponse().getUrl());
//        });

//        devTools.addListener(Network.requestWillBeSent(), requestWillBeSent -> {
//            Request request = requestWillBeSent.getRequest();
//            if (request.getUrl().contains("1470772868388691972")) {
//                request.getHeaders().forEach((key, value) -> System.out.println(key + value));
//                System.out.println("new post");
//            }
//        });


//        String url = "https://twitter.com/i/flow/login";
//        driver.get(url);
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='text'][type='text']")));
//        usernameField.sendKeys("Flashk1k");
//
//        WebElement nextButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='button' and contains(@class, 'css-175oi2r')]//span[text()='Next']")));
//        nextButton.click();
//
//        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='password'][type='password']")));
//        passwordField.sendKeys("dadada1!");
//
//        WebElement loginButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='LoginForm_Login_Button']")));
//        loginButton.click();
//
//        String timelineUrl  = "https://twitter.com/i/timeline";
//
//
//        devTools.send(BackgroundService.startObserving(ServiceName.NOTIFICATIONS));
//        devTools.send(BackgroundService.setRecording(true, ServiceName.NOTIFICATIONS));
//
//        String string = ServiceName.NOTIFICATIONS.toString();
//
//        devTools.addListener(BackgroundService.backgroundServiceEventReceived(), event -> {
//
//            System.out.println(event.toString());
//            System.out.println(event.getInstanceId());
//            System.out.println(event.getEventMetadata().toString());
//            System.out.println(event.getEventName());
//            System.out.println(event.getOrigin());
//            System.out.println(event.getTimestamp());
//            System.out.println(event.getService());
//            System.out.println(event.getServiceWorkerRegistrationId());
//
//            String tweetMadeByName = event.getEventMetadata().get(0).getValue();
//            String tweetContent = event.getEventMetadata().get(1).getValue();
//
//            System.out.println(tweetMadeByName);
//            System.out.println(tweetContent);
//        });

//
//
//        devTools.send(ServiceWorker.enable());
//        ServiceWorker.deliverPushMessage("cool.com", new RegistrationID("123"), "123");
//
//
//        devTools.addListener(ServiceWorker.workerRegistrationUpdated(), event -> {
//            System.out.println("ServiceWorker Event: " + event.toString());
//        });

//        devTools.addListener(Network.dataReceived(), dataReceived -> {
//            System.out.println(dataReceived.getData());
//            System.out.println(dataReceived.getRequestId().toString());
//            System.out.println(dataReceived.getTimestamp().toString());
//        });


//
//            Object serviceWorkers1 = ((org.openqa.selenium.JavascriptExecutor)driver).executeScript("return navigator.serviceWorker.getRegistrations()");
//
//
//        System.out.println(serviceWorkers1);
//

    }

}
