package com.huanyu.base.interfaces.Factories.game.Impl;

import com.huanyu.base.interfaces.Factories.game.Game;
import com.huanyu.base.interfaces.Factories.game.GameFactory;

public class CoinFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Coin();
    }
}
