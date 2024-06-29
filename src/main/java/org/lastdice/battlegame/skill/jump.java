package org.lastdice.battlegame.skill;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class jump implements skill {

    @Override
    public void skill(Player player) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 * 10, 1));
    }
}
