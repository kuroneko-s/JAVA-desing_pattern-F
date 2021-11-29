package com.inflearn.desing_pattern;

import com.inflearn.desing_pattern.factorymethod.BlackShipFactory;
import com.inflearn.desing_pattern.factorymethod.Ship;
import com.inflearn.desing_pattern.factorymethod.ShipFactory;
import com.inflearn.desing_pattern.factorymethod.WhiteShipFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        Ship blackship = createShip(new BlackShipFactory(), "balckship", "choi.dv@mail.com");
        System.out.println(blackship);
        Ship whiteship = createShip(new WhiteShipFactory(), "whiteship", "choi.dv@mail.com");
        System.out.println(whiteship);
    }

    private Ship createShip(ShipFactory factory, String name, String email){
        return factory.orderShip(name, email);
    }

}
