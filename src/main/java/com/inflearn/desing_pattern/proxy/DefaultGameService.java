package com.inflearn.desing_pattern.proxy;

public class DefaultGameService implements GameService{
    @Override
    public void gameStart() {
        System.out.println("게임을 시작하겠습니다.");
    }
}
