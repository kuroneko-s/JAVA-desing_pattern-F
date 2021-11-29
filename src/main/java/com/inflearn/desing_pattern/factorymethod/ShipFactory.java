package com.inflearn.desing_pattern.factorymethod;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        preparedFor(name, email);
        Ship ship = createShip();
        finished(name);
        return ship;
    }

    Ship createShip();

    void finished(String name);

    void preparedFor(String name, String email);

    void validate(String name, String email);

}
