package org.lastdice.battlegame.Item;

import net.kyori.adventure.text.event.HoverEvent;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;



public class armor  {




    public static ItemStack helmet_1() {
        ItemStack itemStack = new ItemStack(Material.IRON_HELMET,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("1단계 모자");

        List<String> lore = new ArrayList<>();
        lore.add("기본 지급");

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack helmet_2() {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_HELMET,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("2단계 모자");

        List<String> lore = new ArrayList<>();
        lore.add("보상 모자");

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack chestplate_1() {
        ItemStack itemStack = new ItemStack(Material.IRON_CHESTPLATE,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("1단계 갑옷");

        List<String> lore = new ArrayList<>();
        lore.add("기본 지급");

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack chestplate_2() {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_CHESTPLATE,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("2단계 갑옷");

        List<String> lore = new ArrayList<>();
        lore.add("보상 갑옷");

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack leggings_1() {
        ItemStack itemStack = new ItemStack(Material.IRON_LEGGINGS,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("1단계 바지");

        List<String> lore = new ArrayList<>();
        lore.add("기본 지급");

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack leggings_2() {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_LEGGINGS,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("2단계 바지");

        List<String> lore = new ArrayList<>();
        lore.add("보상 바지");

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack boots_1() {
        ItemStack itemStack = new ItemStack(Material.IRON_BOOTS,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("1단계 바지");

        List<String> lore = new ArrayList<>();
        lore.add("기본 지급");
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack boots_2() {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_BOOTS,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("2단계 바지");

        List<String> lore = new ArrayList<>();
        lore.add("보상 부츠");
        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public void give(){

    }




}
