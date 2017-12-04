package com.huanyu.base.interfaces.Factories.game.Impl;

import com.huanyu.base.interfaces.Factories.game.Game;

public class Coin implements Game{
    private int numbers = 0;
    private static final int NUMBERS = 2;

    @Override
    public boolean toss() {
        System.out.println("Toss a coin " + numbers);
        return ++numbers != NUMBERS;
    }
}
