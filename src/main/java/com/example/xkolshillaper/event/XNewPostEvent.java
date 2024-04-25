package com.example.xkolshillaper.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class XNewPostEvent extends ApplicationEvent {

    private final String postContent;
    private final String postMadeByName;


    public XNewPostEvent(Object source, String postContent, String postMadeByName) {
        super(source);
        this.postContent = postContent;
        this.postMadeByName = postMadeByName;
    }
}
