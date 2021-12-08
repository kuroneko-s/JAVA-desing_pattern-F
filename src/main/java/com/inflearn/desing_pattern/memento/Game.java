package com.inflearn.desing_pattern.memento;

import java.io.Serializable;

// Originator
public class Game implements Serializable {
    private int redTeamScore;
    private int blueTeamScore;

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public void setRedTeamScore(int redTeamScore) {
        this.redTeamScore = redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public void setBlueTeamScore(int blueTeamScore) {
        this.blueTeamScore = blueTeamScore;
    }

    public GameSave save(){
        return new GameSave(this.redTeamScore, this.blueTeamScore);
    }

    public void restore(GameSave gameSave){
        this.blueTeamScore = gameSave.getBlueTeamScore();
        this.redTeamScore = gameSave.getRedTeamScore();
    }

    @Override
    public String toString() {
        return "Game{" +
                "redTeamScore=" + redTeamScore +
                ", blueTeamScore=" + blueTeamScore +
                '}';
    }
}
