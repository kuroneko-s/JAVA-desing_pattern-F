package com.inflearn.desing_pattern.memento;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GameCareTaker implements Serializable {

    private Map<String, GameSave> careTaker = new HashMap<>();

    public Map<String, GameSave> getCareTaker() {
        return careTaker;
    }

    public void addGameSave(GameSave gameSave) {
        String key = String.valueOf(gameSave.hashCode());
        this.careTaker.put(key, gameSave);
    }

    @Override
    public String toString() {
        return "GameCareTaker{" +
                "careTaker=" + careTaker.toString() +
                '}';
    }
}
