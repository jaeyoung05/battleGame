package org.lastdice.battlegame.give;

import io.lumine.mythic.core.mobs.ActiveMob;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.lastdice.battlegame.Round.Round;
import org.lastdice.battlegame.Round.RoundHandler;

public class RewardHandler implements Listener {

    @EventHandler
    public void reward(PlayerInteractEvent event){
        ItemStack itemStack = event.getPlayer().getInventory().getItemInMainHand();
        if (RoundHandler.killCount == Round.getAmount()){
            if ( itemStack.getType() == Material.ROTTEN_FLESH & event.getAction() == Action.LEFT_CLICK_AIR){
                item item = new giveItem(event.getPlayer());
                item.giveReward();
            }
        }

    }
}
