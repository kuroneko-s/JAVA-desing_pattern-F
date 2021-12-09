package com.inflearn.desing_pattern.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<MyEvent> {

    @EventListener(MyEventNoneExtends.class)
    public void notEventImpl(MyEventNoneExtends myEventNoneExtends){

    }


    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println(event.getSource());
        System.out.println(event.getMessage());
    }
}
