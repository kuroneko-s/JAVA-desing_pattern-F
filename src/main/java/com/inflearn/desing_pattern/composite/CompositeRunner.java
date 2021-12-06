package com.inflearn.desing_pattern.composite;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class CompositeRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Item item_1 = new Item("Item_1", 4000);
        Item item_2 = new Item("Item_2", 5000);

        Bag bag = new Bag();
        List<Item> bagItems = bag.getItems();
        bagItems.add(item_1);
        bagItems.add(item_2);

        printPrice(bag);
    }

    private static void printPrice(Bag bag) {
        List<Item> items = bag.getItems();
        System.out.println(items.stream().mapToInt(Item::getPrice).sum());
        System.out.println(items.stream().mapToInt(Item::getPrice).reduce((left, right) -> left + right).getAsInt());
    }
}
