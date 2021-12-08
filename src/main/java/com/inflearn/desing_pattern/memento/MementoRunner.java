package com.inflearn.desing_pattern.memento;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@Component
public class MementoRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Game game = new Game();
        GameCareTaker careTake = new GameCareTaker();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        careTake.addGameSave(game.save());
        game.setBlueTeamScore(22);
        game.setRedTeamScore(30);
        careTake.addGameSave(game.save());

        Map<String, GameSave> careTaker = careTake.getCareTaker();
        Set<String> keys = careTaker.keySet();
        keys.forEach(key -> System.out.println(key + " : " + careTaker.get(key)));


        Date date = new Date();
        date.getTime();

        try(FileOutputStream fileOutputStream = new FileOutputStream("game.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)){
            out.writeObject(game.save());
        }
        // 역직렬화는 쓰면 위험하다 ( 이펙티브 자바 )
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("game.txt"))){
            in.setObjectInputFilter(createFilter());
            in.readObject();
            // System.out.println(game1.toString());
        }catch (InvalidClassException e) {
            System.out.println(e);
        }
        // https://madplay.github.io/post/prefer-alternatives-to-java-serialization
        // https://madplay.github.io/post/why-java-serialization-is-bad#%EC%97%AD%EC%A7%81%EB%A0%AC%ED%99%94-%ED%95%84%ED%84%B0%EB%A7%81
    }

    private static ObjectInputFilter createFilter() {
        return filterInfo -> {
            Class<?> aClass = filterInfo.serialClass();
            System.out.println("serialClass - " + aClass.toString());
            if (Game.class.isAssignableFrom(aClass)) {
                return ObjectInputFilter.Status.ALLOWED;
            }
            System.err.println("Rejected : " + aClass.getSimpleName());
            return ObjectInputFilter.Status.REJECTED;
        };
    }
}
