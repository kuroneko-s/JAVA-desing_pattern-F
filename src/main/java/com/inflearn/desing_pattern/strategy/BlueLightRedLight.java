package com.inflearn.desing_pattern.strategy;

// Context
public class BlueLightRedLight {
    /*
        생성자로 Speed를 사용해도 되고 메서드에 speed를 넘겨줘서 사용해도 됨
     */
    private Speed speed;

    public BlueLightRedLight(Speed speed) {
        this.speed = speed;
    }

    public void blueLight(){
        this.speed.blueLight();
    }

    public void redLight(Speed speed){
        speed.redLight();
    }
}
