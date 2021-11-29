package com.inflearn.desing_pattern.abstractfactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ShipFactory getShipFactory(){
        return new ShipFactory();
    }

}
