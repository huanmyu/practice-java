package com.huanyu.initialization;

public class A extends B {
    private int radius = 1;

    @Override
    public void draw() {
        System.out.println("A.draw(), radius="+this.radius);
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
