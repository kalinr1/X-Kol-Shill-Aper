package com.example.xkolshillaper.service;

import com.example.xkolshillaper.event.XNewPostEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CaService {

    private final ApeService apeService;

    public CaService(ApeService apeService) {
        this.apeService = apeService;
    }


    @EventListener(XNewPostEvent.class)
    public void scanPostForCa(XNewPostEvent event) throws InterruptedException {
        String postContent = event.getPostContent();

        Pattern caPattern = Pattern.compile("\\b[a-zA-Z0-9]{32,44}\\b");
        Matcher caMatcher = caPattern.matcher(postContent);

        while (caMatcher.find()){
            System.out.println(caMatcher.group());

            apeService.trojanApe(caMatcher.group());
        }
    }
}
