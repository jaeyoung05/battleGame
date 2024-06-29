package org.lastdice.battlegame.Round;

import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.lastdice.battlegame.Map.map;
import org.lastdice.battlegame.game.controller;
import org.lastdice.battlegame.game.gameController;
import org.lastdice.battlegame.game.gameManager;
import org.lastdice.battlegame.give.item;
import org.lastdice.battlegame.mob.mobManager;
import org.lastdice.battlegame.mob.mobSpawn;

public class Round {

    private static int round = 0;
    private static int amount = 0 ;
    private static int level = 0 ;



    public static int getAmount() {
        return amount;
    }

    public static int getRound() {
        return round;
    }



    public static void startRound(Player player){
        round = 0;
        round ++;
        amount = 2;
        mobManager mob = new mobSpawn();
        mob.setSpawn(player, amount, level);
        player.sendMessage(round + "라운드 시작");
        round ++;
    }

    public static void startRound_2(Player player){
        round++;
        level += 4;
        amount += 4;
        mobManager mob = new mobSpawn();
        mob.setSpawn(player, amount, level);
        player.sendMessage(round + "라운드 시작");
        round ++;
    }

    public static void nextRound(Player player){
        round++;
        level++;
        amount += 2;
        mobManager mob = new mobSpawn();
        mob.setSpawn(player, amount, level);

    }

    public static void endRound(Player player){
    controller controller = gameManager.getOrCreateGameController(player);
    controller.stopGame();

    }
}
