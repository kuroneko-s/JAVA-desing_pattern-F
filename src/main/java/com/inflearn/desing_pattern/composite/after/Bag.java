package com.inflearn.desing_pattern.composite.after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{

    // 이부분이 중요함 Item ( Leaf Type )을 참조해서는 안된다.
    List<Component> components;

    public Bag() {
        if (components == null) {
            components = new ArrayList<>();
        }
    }

    public void add(Component component) {
        this.components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "items=" + components.toString() +
                '}';
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
