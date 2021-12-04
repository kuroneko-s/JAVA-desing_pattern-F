package com.inflearn.desing_pattern.flyweight;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class FlyweightRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FontFactory factory = new FontFactory();
        Character c1 = new Character('h', "white", factory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", factory.getFont("nanum:12"));
        Character c3 = new Character('l', "white", factory.getFont("nanum:12"));
        Character c4 = new Character('o', "white", factory.getFont("nanum:12"));

//        Integer.valueOf(10)
    }
}
