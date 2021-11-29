package com.inflearn.desing_pattern.abstractfactory;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
