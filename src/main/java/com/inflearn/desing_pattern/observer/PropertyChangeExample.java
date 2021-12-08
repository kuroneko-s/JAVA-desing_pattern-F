package com.inflearn.desing_pattern.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeExample {
    static class User implements PropertyChangeListener{
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            System.out.println(evt.getNewValue());
        }
    }

    static class Subject {
        PropertyChangeSupport support = new PropertyChangeSupport(this);

        public void addObserver(PropertyChangeListener listener){
            support.addPropertyChangeListener("NewValue", listener);
        }

        public void removeObserver(PropertyChangeListener listener){
            support.removePropertyChangeListener("NewValue", listener);
        }

        public void add(String message){
            support.firePropertyChange("NewValue", null, message);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        User observer = new User();
        subject.addObserver(observer); // listener
        subject.add("자바 PCL 예제 코드");
        subject.removeObserver(observer);
        subject.add("이제 없어");
    }
}
