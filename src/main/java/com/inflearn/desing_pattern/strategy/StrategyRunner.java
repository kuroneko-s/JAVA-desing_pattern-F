package com.inflearn.desing_pattern.strategy;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

// Client
@Component
public class StrategyRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        BlueLightRedLight game = new BlueLightRedLight(new Normal());
        game.blueLight();
        game.redLight(new Faster());
    }
}
