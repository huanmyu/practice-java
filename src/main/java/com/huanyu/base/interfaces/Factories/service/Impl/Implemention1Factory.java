package com.huanyu.base.interfaces.Factories.service.Impl;

import com.huanyu.base.interfaces.Factories.service.Service;
import com.huanyu.base.interfaces.Factories.service.ServiceFactory;

public class Implemention1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implemention1();
    }
}
