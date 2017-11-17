package com.huanyu.initialization;

public abstract class B {
    public abstract void draw();

    public B() {
        System.out.println("B Constructor");
        draw();
    }
}
