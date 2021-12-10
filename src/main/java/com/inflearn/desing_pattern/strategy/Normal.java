package com.inflearn.desing_pattern.strategy;

// ConcreteStrategy
public class Normal implements Speed{
    @Override
    public void blueLight() {
        System.out.println(" 1배속 노멀 ~ ");
    }

    @Override
    public void redLight() {
        System.out.println(" 1배속 노오오오오오머러어어어어어얼 ~ ");
    }
}
