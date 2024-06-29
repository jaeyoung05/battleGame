package org.lastdice.battlegame.mob;

import io.lumine.mythic.api.mobs.MythicMob;
import io.lumine.mythic.bukkit.BukkitAdapter;
import io.lumine.mythic.bukkit.MythicBukkit;
import io.lumine.mythic.bukkit.events.MythicMobSpawnEvent;
import io.lumine.mythic.core.mobs.ActiveMob;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.lastdice.battlegame.Map.land;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class mobSpawn implements mobManager {

    public final MythicMob mobs = MythicBukkit.inst().getMobManager().getMythicMob("spadesoldier").orElse(null);

    List<ActiveMob> list = new ArrayList<>();

    @Override
    public void spawn(Player player, int level) {
        Location location = player.getLocation();
        Location a= location.clone().add(5,0,0);
        if (mobs != null) {
            ActiveMob spade = mobs.spawn(BukkitAdapter.adapt(a), level);
            list.add(spade);
        }
    }

    @Override
    public void setSpawn(Player player,int amount, int level) {
        for (int i = 0; i < amount; i++) {
            spawn(player,level);
        }
    }

//    @Override
//    public void remove() {
//        ActiveMob activeMob = list.get(0);
//        activeMob.remove();
//
//
//    }
}





