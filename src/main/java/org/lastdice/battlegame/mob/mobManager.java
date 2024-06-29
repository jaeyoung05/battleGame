package org.lastdice.battlegame.mob;

import org.bukkit.entity.Player;

public interface mobManager {

    public void spawn(Player player, int level);

    public void setSpawn(Player player ,int amount, int level);

//    public void remove();

}
