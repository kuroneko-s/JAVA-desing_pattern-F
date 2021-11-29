package com.inflearn.desing_pattern.abstractfactory;

import com.inflearn.desing_pattern.factorymethod.Ship;
import com.inflearn.desing_pattern.factorymethod.WhiteShip;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class ShipFactory implements FactoryBean<Ship> {
    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("Bean으로 만들어준 Ship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
