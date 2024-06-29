package org.lastdice.battlegame.command;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.lastdice.battlegame.game.controller;
import org.lastdice.battlegame.game.gameManager;
import org.lastdice.battlegame.give.giveItem;
import org.lastdice.battlegame.give.item;

public class Command extends BukkitCommand {
    public Command(@NotNull String name) {
        super(name);
    }

    @Override
    public boolean execute(@NotNull CommandSender commandSender, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player player)){
            return false;
        }

        if(strings.length == 0){
            return false;
        }


        switch (strings[0].toLowerCase()){

//            case "spawn" ->{
//                mobSpawn mobSpawn = new mobSpawn();
//                mobSpawn.spawn( player,1);
//            }

            case "start" -> {
                controller controller = gameManager.getOrCreateGameController(player);
                controller.startGame();
            }


            case "start2" -> {
                controller controller = gameManager.getOrCreateGameController(player);
                controller.startGame_2();
            }

            case "stop" -> {
                controller controller = gameManager.getOrCreateGameController(player);
                controller.stopGame();
            }


        }


        return false;
    }
}
