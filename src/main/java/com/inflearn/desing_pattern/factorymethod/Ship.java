package com.inflearn.desing_pattern.factorymethod;

import com.inflearn.desing_pattern.abstractfactory.Anchor;
import com.inflearn.desing_pattern.abstractfactory.Wheel;
import com.inflearn.desing_pattern.abstractfactory.WhiteAnchor;
import com.inflearn.desing_pattern.abstractfactory.WhiteWheel;
import lombok.ToString;

@ToString
public class Ship {

    private String name;
    private String color;
    private String logo;

    private Anchor anchor;
    private Wheel wheel;

    public Anchor getAnchor() {
        return anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
