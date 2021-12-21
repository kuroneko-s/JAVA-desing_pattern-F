package com.inflearn.desing_pattern;

import java.util.ArrayList;
import java.util.List;

public class GenericEx <Ele>{
    private Ele field;
    private List<? extends Object> myList = new ArrayList<>();

    public Ele getField() {
        return field;
    }

    public GenericEx(Ele v) {
        this.field = v;
    }

    public List<? extends Object> getMyList() {
        return myList;
    }

    @Override
    public String toString() {
        return "GenericEx{" +
                "field=" + field +
                '}';
    }
}
