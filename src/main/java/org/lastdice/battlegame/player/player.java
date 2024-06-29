package org.lastdice.battlegame.player;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface player {

    @NotNull Player getPlayer();

    @NotNull Player death();


}
