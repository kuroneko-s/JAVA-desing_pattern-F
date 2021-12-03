package com.inflearn.desing_pattern.composite.before;

import com.inflearn.desing_pattern.composite.before.Bag;
import com.inflearn.desing_pattern.composite.before.Item;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class CompotisteRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Item item_1 = new Item("item_1", 3000);
        Item item_2 = new Item("item_2", 2000);

        Bag bag = new Bag();
        bag.add(item_1);
        bag.add(item_2);

        printPrice(bag);
    }

    private void getPrice(Item item){
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        List<Item> items = bag.getItems();
        int sum = items.stream().mapToInt(Item::getPrice).sum();
        Integer integer = items.stream().map(Item::getPrice).reduce((a, b) -> a + b).get();


        System.out.println(integer);
    }
}
