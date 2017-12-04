package com.huanyu.base.interfaces.Factories.game.Impl;

import com.huanyu.base.interfaces.Factories.game.Game;

public class Dice implements Game{
    private int numbers = 0;
    private static final int NUMBERS = 6;

    @Override
    public boolean toss() {
        System.out.println("Toss a dice " + numbers);
        return ++numbers != NUMBERS;
    }
}
