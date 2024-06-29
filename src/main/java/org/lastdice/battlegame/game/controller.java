package org.lastdice.battlegame.game;

import org.jetbrains.annotations.NotNull;
import org.lastdice.battlegame.Map.border;
import org.lastdice.battlegame.Map.map;
import org.lastdice.battlegame.give.item;


public interface controller {




    @NotNull map getMap();

    @NotNull
    border border();

    @NotNull
    item getItem();


    void startGame();

    void startGame_2();


    void stopGame();


}
