package org.lastdice.battlegame.skill;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class speed implements skill {
    @Override
    public void skill(Player player) {
        PotionEffect effect = new PotionEffect(PotionEffectType.SPEED,20 * 10,1);
        player.addPotionEffect(effect);
    }
}
