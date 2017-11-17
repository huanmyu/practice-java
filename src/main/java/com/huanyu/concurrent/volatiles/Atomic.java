package com.huanyu.concurrent.volatiles;

public class Atomic {
    // 自增操作不是原子性操作，而且volatile也无法保证对变量的任何操作都是原子性的。
//    作者：半兽人
//    链接：http://www.orchome.com/138
//    来源：OrcHome
    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start test volatile automic...");
        final Atomic test = new Atomic();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<10000;j++)
                        test.increase();
                };
            }.start();
        }
        System.out.println(Thread.activeCount());
//        while(Thread.activeCount()>1) {//保证前面的线程都执行完
//            System.out.println(Thread.activeCount());
//        }
        Long l = 100000L;
        Thread.sleep(l);
        System.out.println(Thread.activeCount());
        System.out.println(test.inc);
    }
}
