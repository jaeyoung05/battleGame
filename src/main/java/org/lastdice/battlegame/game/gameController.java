package org.lastdice.battlegame.game;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.lastdice.battlegame.Json.Json;
import org.lastdice.battlegame.Map.*;
import org.lastdice.battlegame.Round.Round;
import org.lastdice.battlegame.give.item;
import org.lastdice.battlegame.mob.mobManager;

import java.util.Random;

//import org.lastdice.battlegame.mob.mobManager;
//import org.lastdice.battlegame.mob.mobSpawn;

public class gameController implements controller {

    private final map map;
    private final item setItem;
    private final border border;
    private Player player;
    private mobManager mobManager;
    private Round round;
    public static int difficult;

    public gameController(map map, item setItem, border border, Player player, mobManager mobManager, Round round) {
        this.map = map;
        this.setItem = setItem;
        this.border = border;
        this.player = player;
        this.mobManager = mobManager;
        this.round = round;
    }



    @NotNull
    @Override
    public map getMap() {
        return map;
    }

    @NotNull
    @Override
    public border border() {
        return border;
    }

    @NotNull
    @Override
    public item getItem() {
        return setItem;
    }

    int stage = Round.getRound();

    @Override
    public void startGame() {
        map.map(player);
        border.Border(player);
        setItem.giveArmor();
        setItem.giveWeapon();
        setItem.giveUsing();
        round.startRound(player);
        difficult = 1;
    }

    @Override
    public void startGame_2() {
        map.map(player);
        border.Border(player);
        setItem.giveArmor2();
        setItem.giveWeapon2();
        setItem.giveUsing();
        Round.startRound_2(player);
        difficult = 2;
    }

    @Override
    public void stopGame() {
        border.Remove(player);
        setItem.clear();
        map.remvoe();
        Json.data();

    }
}
