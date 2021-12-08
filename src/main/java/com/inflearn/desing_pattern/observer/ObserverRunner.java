package com.inflearn.desing_pattern.observer;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ObserverRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        MessageServer messageServer = new MessageServer();
        User user1 = new User("user1");
        User user2 = new User("user2");
        
        messageServer.subscribe("디자인패턴", user1);
        messageServer.subscribe("디자인패턴", user2);

        messageServer.subscribe("퇴근", user1);
        
        messageServer.sendMessage(user1, "디자인패턴", "옵저버패턴");
        messageServer.sendMessage(user2, "퇴근", "집가고싶다");
    }
}
