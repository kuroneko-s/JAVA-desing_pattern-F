package com.inflearn.desing_pattern.proxy;

public class GameServiceProxy implements GameService{

    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void gameStart(){
        long before = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            new RuntimeException(e);
        }
        gameService.gameStart();
        System.out.println("finish - " + (System.currentTimeMillis() - before));
    }
}
