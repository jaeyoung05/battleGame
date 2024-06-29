package org.lastdice.battlegame.give;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.lastdice.battlegame.Item.armor;
import org.lastdice.battlegame.Item.using;
import org.lastdice.battlegame.Item.weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class giveItem implements item {

    private final Player player;
     Random random = new Random();
    public giveItem(Player player) {
        this.player = player;
    }


    @Override
    public void giveArmor() {
        player.getInventory().setHelmet(org.lastdice.battlegame.Item.armor.helmet_1());
        player.getInventory().setChestplate(org.lastdice.battlegame.Item.armor.chestplate_1());
        player.getInventory().setLeggings(org.lastdice.battlegame.Item.armor.leggings_1());
        player.getInventory().setBoots(org.lastdice.battlegame.Item.armor.boots_1());
    }

    @Override
    public void giveArmor2() {
        player.getInventory().setChestplate(org.lastdice.battlegame.Item.armor.chestplate_1());
        player.getInventory().setBoots(org.lastdice.battlegame.Item.armor.boots_1());
    }

    @Override
    public void giveWeapon() {
        player.getInventory().addItem(org.lastdice.battlegame.Item.weapon.sword_1());
        player.getInventory().addItem(org.lastdice.battlegame.Item.weapon.bow());
        player.getInventory().addItem(org.lastdice.battlegame.Item.weapon.arrow());

    }

    @Override
    public void giveWeapon2() {
        player.getInventory().addItem(org.lastdice.battlegame.Item.weapon.sword_1());
    }

    @Override
    public void giveUsing() {
        player.getInventory().addItem(org.lastdice.battlegame.Item.using.feather());
        player.getInventory().addItem(org.lastdice.battlegame.Item.using.slime_ball());

    }

    @Override
    public void giveReward() {
        List<ItemStack> list = new ArrayList<>();
        list.add(armor.helmet_2());
        list.add(armor.chestplate_2());
        list.add(armor.leggings_2());
        list.add(armor.boots_2());
        list.add(using.bread());
        list.add(using.goldenApple());
        list.add(weapon.sword_1());
        list.add(weapon.arrow());
        player.getInventory().addItem(list.get(random.nextInt(list.size())));
    }

    @Override
    public void clear() {
        player.getInventory().clear();
    }
}
