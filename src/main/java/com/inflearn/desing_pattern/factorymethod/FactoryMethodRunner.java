package com.inflearn.desing_pattern.factorymethod;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class FactoryMethodRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Ship whiteship = createShip(new WhiteShipFactory(), "whiteship", "test@email.com");
        System.out.println(whiteship);
        Ship blackship = createShip(new BlackShipFactory(), "blackship", "test@email.com");
        System.out.println(blackship);
    }

    private Ship createShip(ShipFactory factory, String name, String email){
        return factory.orderShip(name, email);
    }
}
