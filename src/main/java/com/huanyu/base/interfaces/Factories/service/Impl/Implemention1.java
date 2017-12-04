package com.huanyu.base.interfaces.Factories.service.Impl;

import com.huanyu.base.interfaces.Factories.service.Service;

public class Implemention1 implements Service{
    @Override
    public void method1() {
        System.out.println("Implemention1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implemention1 method2");
    }
}
