package org.lastdice.battlegame.Map;

import com.google.common.collect.Lists;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.List;

public class land_2 implements map{

    private final List<Location> list = Lists.newArrayList();

    @Override
    public void map(Player player) {
        World world = player.getWorld();
        Location location = player.getLocation();
        Location blockLocation = location.add(-10, -1, -10);
        list.add(blockLocation);
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                Location block = blockLocation.clone().add(i, 0, j);
                block.getBlock().setType(Material.STONE);
            }
        }
    }

    @Override
    public void remvoe() {
        for (Location location : list) {
            for (int i = 0; i <= 21; i++) {
                for (int j = 0; j < 21; j++) {
                    Location block = location.clone().add(i, 0, j);
                    block.getBlock().setType(Material.AIR);
                }
            }

        }
    }
}
