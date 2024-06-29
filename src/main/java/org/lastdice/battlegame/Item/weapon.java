package org.lastdice.battlegame.Item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class weapon {



    public static ItemStack sword_1() {
        ItemStack itemStack = new ItemStack(Material.IRON_SWORD,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("1단계 검");

        List<String> lore = new ArrayList<>();
        lore.add("기본 지급");
        meta.setLore(lore);

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack sword_2() {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("2단계 검");

        List<String> lore = new ArrayList<>();
        lore.add("보상 검");

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack bow() {
        ItemStack itemStack = new ItemStack(Material.BOW,1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("활");

        List<String> lore = new ArrayList<>();
        lore.add("화살은 다음 단계에서 추가 지급");

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack arrow() {
        ItemStack itemStack = new ItemStack(Material.ARROW,10);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("화살");

        List<String> lore = new ArrayList<>();
        lore.add("보상으로 선택이 가능합니다");

        itemStack.setItemMeta(meta);

        return itemStack;
    }










}
