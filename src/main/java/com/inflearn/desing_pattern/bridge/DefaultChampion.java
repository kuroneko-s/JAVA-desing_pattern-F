package com.inflearn.desing_pattern.bridge;

public class DefaultChampion implements Champion{

    private Skin skin;

    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s skill Q\n", this.skin.getName(), name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s skill W\n", this.skin.getName(), name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s skill E\n", this.skin.getName(), name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s skill R\n", this.skin.getName(), name);
    }

    @Override
    public void move() {
        System.out.printf("%s %s Move\n", this.skin.getName(), name);
    }

    @Override
    public void specialSkill() {
        System.out.printf("%s %s 겁나 짱썐 스킬\n", this.skin.getName(), name);
    }
}
