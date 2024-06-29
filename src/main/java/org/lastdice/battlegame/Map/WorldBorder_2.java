package org.lastdice.battlegame.Map;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.entity.Player;

public class WorldBorder_2 implements border{

    private double originalSize;
    private Location originalCenter;





    @Override
    public void Border(Player player) {
        World world = player.getWorld();
        WorldBorder worldBorder = world.getWorldBorder();
        Location location = player.getLocation();
        worldBorder.setCenter(location);
        worldBorder.setSize(20);

        originalSize = worldBorder.getSize();
        originalCenter = worldBorder.getCenter();


    }

    @Override
    public void Remove(Player player){
        World world = originalCenter.getWorld();
        world.getWorldBorder().reset();


    }

}
