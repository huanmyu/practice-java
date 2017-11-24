package com.huanyu.initialization;

public abstract class B {
    static {
        System.out.println("basic class before field point init");
    }

    public abstract void draw();

    public void point() {
        System.out.println("运行基类 point 方法");
    }

    public B() {
        System.out.println("B Constructor");
        point();
        draw();
    }
}
