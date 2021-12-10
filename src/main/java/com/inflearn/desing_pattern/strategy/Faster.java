package com.inflearn.desing_pattern.strategy;

// ConcreteStrategy
public class Faster implements Speed{
    @Override
    public void blueLight() {
        System.out.println("좀더 빠름");
    }

    @Override
    public void redLight() {
        System.out.println("좀더 빠름 슉슈슉");
    }
}
