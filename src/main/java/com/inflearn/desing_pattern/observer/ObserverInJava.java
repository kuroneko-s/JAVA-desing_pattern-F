package com.inflearn.desing_pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverInJava {
    static class User implements Observer{
        @Override
        public void update(Observable observable, Object o) {
            System.out.println(o);
        }
    }

    static class Subject extends Observable{
        public void add(String message) {
            setChanged();
            notifyObservers(message);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        User user = new User();
        subject.addObserver(user);
        subject.add("Hello Observer");
    }
}
