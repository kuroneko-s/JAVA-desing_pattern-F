package com.inflearn.desing_pattern.memento;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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

        try(FileOutputStream fileOutputStream = new FileOutputStream("gamesave.hex");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)){
            out.writeObject(careTake);
        }
    }
}
