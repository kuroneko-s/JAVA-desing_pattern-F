package com.inflearn.desing_pattern.flyweight;

public class Character {

    char value;
    String color;
    Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }

    public char getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public Font getFont() {
        return font;
    }
}
