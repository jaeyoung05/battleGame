package org.lastdice.battlegame.game;

import com.google.common.collect.Maps;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.lastdice.battlegame.Map.border;
import org.lastdice.battlegame.Map.land;
import org.lastdice.battlegame.Map.map;
import org.lastdice.battlegame.Map.worldBorder;
import org.lastdice.battlegame.Round.Round;
import org.lastdice.battlegame.give.giveItem;
import org.lastdice.battlegame.give.item;
import org.lastdice.battlegame.mob.mobManager;
import org.lastdice.battlegame.mob.mobSpawn;


import java.util.Map;
import java.util.UUID;

public class gameManager {



    private static final Map<UUID, controller> controllers = Maps.newHashMap();


    public static @NotNull controller getOrCreateGameController(@NotNull Player player) {



        return controllers.computeIfAbsent(player.getUniqueId(), k-> creatGameController(player));
    }

    public static @NotNull controller creatGameController(@NotNull Player player) {
        map map = new land();
        border border = new worldBorder();
        item item = new giveItem(player);
        mobManager mobManager = new mobSpawn();
        Round round = new Round();

        return new gameController(map, item, border, player, mobManager, round );
    }
}
