package org.lastdice.battlegame;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.lastdice.battlegame.Round.RoundHandler;
import org.lastdice.battlegame.command.Command;


import org.lastdice.battlegame.give.RewardHandler;
import org.lastdice.battlegame.skill.skillListener;

public final class BattleGame extends JavaPlugin {


    public static BattleGame instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().warning("활성화");

        instance = this;

        Bukkit.getCommandMap().register("Battle", new Command("game"));

        Bukkit.getPluginManager().registerEvents(new skillListener(), this);

        Bukkit.getPluginManager().registerEvents(new RoundHandler(), this);

        Bukkit.getPluginManager().registerEvents(new RewardHandler(), this);







    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
