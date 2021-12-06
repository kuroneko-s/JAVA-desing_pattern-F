package com.inflearn.desing_pattern.command;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class CommandRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Button button = new Button();
        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        SimpleJdbcInsert
//        SimpleJdbcCall -> 프로시저 호출
    }
}
