package com.inflearn.desing_pattern.memento;

import java.io.Serializable;

// Memento
public final class GameSave implements Serializable{
    private final int redTeamScore;
    private final int blueTeamScore;

    public GameSave(int redTeamScore, int blueTeamScore) {
        this.redTeamScore = redTeamScore;
        this.blueTeamScore = blueTeamScore;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }
}
