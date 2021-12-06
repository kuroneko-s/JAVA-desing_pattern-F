package com.inflearn.desing_pattern.bridge;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class BridgeRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        Champion KDA아리 = new 아리(new KDA());
        KDA아리.move();
        KDA아리.skillE();
        KDA아리.specialSkill();

        Champion NewSkin아칼리 = new 아칼리(new NewSkin());
        NewSkin아칼리.skillQ();
        NewSkin아칼리.skillW();
    }
}
