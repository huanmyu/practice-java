package com.huanyu.initialization;

public class A extends B {
    static {
        System.out.println("before field point init");
    }

    {
        System.out.println("非静态块 before field point init");
    }

    private int radius = 1;
    private static int point = 10;

    static {
        System.out.println("静态块 before point === " + point);
        point = 100;
        System.out.println("静态块 after point === " + point);
    }

    {
        System.out.println("非静态块 before radius === " + radius);
        radius = 2;
        System.out.println("非静态块 after radius === " + radius);
    }

    @Override
    public void draw() {
        System.out.println("A.draw(), radius="+this.radius);
        super.point();
    }

    {
        System.out.println("before radius === " + radius);
        radius = 10;
        System.out.println("after radius === " + radius);
    }

    @Override
    public void point() {
        System.out.println("运行子类 point 方法");
    }

    public A(int radius) {
        this.radius = radius;
        System.out.println("A constructor");
    }

    public static void main(String []args) {
        A a = new A(5);
        a.draw();
    }
}
