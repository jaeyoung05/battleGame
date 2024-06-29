



package org.lastdice.battlegame.Round;

import com.google.common.eventbus.DeadEvent;
import io.lumine.mythic.bukkit.MythicBukkit;
import io.lumine.mythic.core.mobs.ActiveMob;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.lastdice.battlegame.BattleGame;
import org.lastdice.battlegame.give.giveItem;

public class RoundHandler implements Listener {

    public static int killCount = 0;
    public static Player player;


    @EventHandler
    public void event(EntityDeathEvent event){
        ActiveMob activeMob = MythicBukkit.inst().getMobManager().getActiveMob(event.getEntity().getUniqueId()).orElse(null);
        if (activeMob != null){
            killCount ++;
            if (killCount == Round.getAmount() ){
                warning(event.getEntity().getKiller());
                Bukkit.getScheduler().scheduleSyncDelayedTask(BattleGame.instance, () -> {
                    Round.nextRound(event.getEntity().getKiller());
                    killCount = 0;
                }, 20*10);
            }
        }
        player = event.getEntity().getKiller();
    }

    public void warning(Player player){

        Bukkit.getScheduler().scheduleSyncDelayedTask(BattleGame.instance, () ->{
            player.sendMessage("3초 후 " + Round.getRound() + " 라운드를 시작합니다");
        },20*7);
    }

    @EventHandler
    public void death(PlayerDeathEvent event) {
        result(event.getPlayer());
        Round.endRound(event.getPlayer());

    }

    public void result(Player player){
        int last = Round.getRound() - 2;
        player.sendMessage(last + "라운드 클리어");
    }

}
