package org.lastdice.battlegame.Item;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

public class using {

    public static NamespacedKey KEY_NAME = new NamespacedKey("game","test");

    public static ItemStack feather(){
        ItemStack itemStack = new ItemStack(Material.FEATHER,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("효과");

        List<String> lore = new ArrayList<>();
        lore.add("우클릭으로 사용");

        PersistentDataContainer date = meta.getPersistentDataContainer();

        date.set(KEY_NAME,PersistentDataType.INTEGER, 1);

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack slime_ball(){
        ItemStack itemStack = new ItemStack(Material.SLIME_BALL,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("효과");

        List<String> lore = new ArrayList<>();
        lore.add("우클릭으로 사용");

        PersistentDataContainer date = meta.getPersistentDataContainer();

        date.set(KEY_NAME,PersistentDataType.INTEGER, 2);

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack bread(){
        ItemStack itemStack = new ItemStack(Material.BREAD,1);
        return itemStack;
    }

    public static ItemStack goldenApple(){
        ItemStack itemStack = new ItemStack(Material.GOLDEN_APPLE);
        return itemStack;
    }

}
