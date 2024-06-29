package org.lastdice.battlegame.Json;

import java.util.ArrayList;
import java.util.List;

public class PlayerData {

    private String name;
    private int round;
    private int difficult;
    private final List<Integer> list = new ArrayList<>();

    public PlayerData(String name, int round, int difficult) {
        this.name = name;
        this.round = round;
        this.difficult = difficult;
    }

    public String getName() {
        return name;
    }

    public int getRound() {


        return round;
    }

    public int difficult() {
        return difficult;
    }
}
