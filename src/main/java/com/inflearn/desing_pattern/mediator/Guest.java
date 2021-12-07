package com.inflearn.desing_pattern.mediator;

public class Guest {
    private FrontDesk frontDesk;
    private Integer id;

    public Guest(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public Integer getId() {
        return id;
    }

    public Guest(Integer id) {
        this.id = id;
    }

    public void getTowel(int numberOfTowel) {
        this.frontDesk.getTowel(this.id, numberOfTowel);
    }
}
