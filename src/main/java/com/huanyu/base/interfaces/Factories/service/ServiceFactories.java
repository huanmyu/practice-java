package com.huanyu.base.interfaces.Factories.service;

import com.huanyu.base.interfaces.Factories.service.Impl.Implemention1Factory;
import com.huanyu.base.interfaces.Factories.service.Impl.Implemention2Factory;

public class ServiceFactories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implemention1Factory());
        serviceConsumer(new Implemention2Factory());
    }
}
