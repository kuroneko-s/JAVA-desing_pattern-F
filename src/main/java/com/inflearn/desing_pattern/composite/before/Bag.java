package com.inflearn.desing_pattern.composite.before;

import java.util.ArrayList;
import java.util.List;

public class Bag {

    List<Item> items;

    public Bag() {
        if (items == null) {
            items = new ArrayList<>();
        }
    }

    public void add(Item item) {
        this.items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "items=" + items.toString() +
                '}';
    }
}
