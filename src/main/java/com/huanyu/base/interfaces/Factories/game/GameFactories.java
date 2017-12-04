package com.huanyu.base.interfaces.Factories.game;

import com.huanyu.base.interfaces.Factories.game.Impl.CoinFactory;
import com.huanyu.base.interfaces.Factories.game.Impl.DiceFactory;

public class GameFactories {
    public static void playGame(GameFactory gameFactory) {
        Game g = gameFactory.getGame();
        while (!g.toss()) {

        }
    }

    public static void main(String[] args) {
        playGame(new CoinFactory());
        playGame(new DiceFactory());
    }
}
