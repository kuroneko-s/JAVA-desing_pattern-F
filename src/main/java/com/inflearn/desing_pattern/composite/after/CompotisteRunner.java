package com.inflearn.desing_pattern.composite.after;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import javax.swing.*;

//@Service
public class CompotisteRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Item item_1 = new Item("item_1", 3000);
        Item item_2 = new Item("item_2", 2000);

        Bag bag = new Bag();
        bag.add(item_1);
        bag.add(item_2);

//        printPrice(item_1);
//        printPrice(bag);

        JFrame frame = new JFrame();
        JTextField textField = new JTextField();
        textField.setBounds(200, 200, 200, 40);
        frame.add(textField);

        JButton button = new JButton("click");
        button.setBounds(200, 100, 60, 40);
        button.addActionListener(e -> textField.setText("Hello Swing"));
        frame.add(button);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
