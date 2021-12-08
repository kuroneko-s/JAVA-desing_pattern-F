package com.inflearn.desing_pattern.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Subject
public class MessageServer {
    // 참조하고 있는 레퍼런스가 있는 이상 CG가 동작하지 않음
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void subscribe(String subscribe, Subscriber subscriber) {
        if (this.subscribers.containsKey(subscribe))
            this.subscribers.get(subscribe).add(subscriber);
        else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            this.subscribers.put(subscribe, list);
        }
    }

    // CG가 동작을 하게 하기 위해선 적당한 타이밍에 unregister를 지속적으로 사용을 해줘야한다.
    public void unregister(String subscribe, Subscriber subscriber) {
        if (this.subscribers.containsKey(subscribe))
            this.subscribers.get(subscribe).remove(subscriber);
    }

    public void sendMessage(User user, String subscribe, String message) {
        if (this.subscribers.containsKey(subscribe)) {
            String userMessage = user.getName() + " : " + message;
            this.subscribers.get(subscribe).forEach(s -> s.handleMessage(userMessage));
        }
    }

}
