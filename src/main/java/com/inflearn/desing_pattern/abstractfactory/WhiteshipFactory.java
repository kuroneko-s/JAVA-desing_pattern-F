package com.inflearn.desing_pattern.abstractfactory;

import com.inflearn.desing_pattern.factorymethod.DefaultShipFactory;
import com.inflearn.desing_pattern.factorymethod.Ship;
import com.inflearn.desing_pattern.factorymethod.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setWheel(shipPartsFactory.createWheel());
        ship.setAnchor(shipPartsFactory.createAnchor());

        return ship;
    }
}
