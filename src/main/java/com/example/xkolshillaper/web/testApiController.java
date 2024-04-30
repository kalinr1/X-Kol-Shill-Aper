package com.example.xkolshillaper.web;

import com.example.xkolshillaper.service.ApeService;
import com.example.xkolshillaper.service.TwitterListenerService_DefaultSelenium;
import com.example.xkolshillaper.service.TwitterListenerService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class testApiController {

    private final ApeService apeService;
    private final TwitterListenerService_DefaultSelenium twitterListenerServiceDefaultSelenium;

    private final TwitterListenerService twitterListenerService;

    public testApiController(ApeService apeService, TwitterListenerService_DefaultSelenium twitterListenerServiceDefaultSelenium, TwitterListenerService twitterListenerService) {
        this.apeService = apeService;
        this.twitterListenerServiceDefaultSelenium = twitterListenerServiceDefaultSelenium;
        this.twitterListenerService = twitterListenerService;
    }

    @PostMapping("/apeTest/{ca}")
    public void apeTest(@PathVariable String ca) throws InterruptedException {
        apeService.trojanApe(ca);
    }

//    @GetMapping("/launchNewPostService")
//    public void testLaunchNewPostService(){
//        newPostService.launchDriverLoginAndListenForNotifications();
//    }

    @PostMapping("/twitterListener")
    public void testLaunchTwitterListener(){
        twitterListenerService.launchPostListener();
    }
}
