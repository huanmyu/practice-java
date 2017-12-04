package com.huanyu.base.interfaces.nesting;

public interface E {
    interface G {
        void f();
    }

    public interface H {
        void f();
    }

    void g();
}
