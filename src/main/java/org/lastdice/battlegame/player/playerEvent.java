package org.lastdice.battlegame.player;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class playerEvent implements player{


    private final Player player;

    public playerEvent(Player plyer) {
        this.player = plyer;
    }

    @NotNull
    @Override
    public Player getPlayer() {
        return player;
    }

    @NotNull
    @Override
    public Player death() {
        return player;
    }
}
