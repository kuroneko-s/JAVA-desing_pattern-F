package com.inflearn.desing_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    Map<String, Font> cache = new HashMap<>();

    public Font getFont(String key){
        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            String[] keyAndVal = key.split(":");
            Font newFont = new Font(keyAndVal[0], Integer.valueOf(keyAndVal[1]));
            cache.put(key, newFont);
            return newFont;
        }
    }
}
