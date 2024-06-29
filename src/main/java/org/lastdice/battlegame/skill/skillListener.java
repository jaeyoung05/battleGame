package org.lastdice.battlegame.skill;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.lastdice.battlegame.Item.using;

import javax.swing.*;

import static org.lastdice.battlegame.Item.using.feather;

public class skillListener implements Listener {


    private using using;
    private jump jump;
    private skill skill;
    private speed speed;







    @EventHandler(priority = EventPriority.LOWEST)

    public void skillEvent (PlayerInteractEvent event){

        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();
        ItemStack feather = org.lastdice.battlegame.Item.using.feather();
        ItemStack slime_ball = org.lastdice.battlegame.Item.using.slime_ball();

        if (item.getType() == Material.FEATHER & event.getAction() == Action.LEFT_CLICK_AIR){

            skill speed = new speed();
            speed.skill(player);

        } else if (item.getType() == Material.SLIME_BALL & event.getAction() == Action.LEFT_CLICK_AIR) {
            skill jump = new jump();
            jump.skill(player);

        }


    }

}
