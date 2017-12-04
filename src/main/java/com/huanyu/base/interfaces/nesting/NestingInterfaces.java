package com.huanyu.base.interfaces.nesting;


public class NestingInterfaces {
    public class BImpl implements A.B {
        @Override
        public void f() {}
    }

    public class CImpl implements A.C {
        @Override
        public void f() {}
    }

    class EImpl implements E {
        @Override
        public void g() {}
    }

    class EGImpl implements E.G {
        @Override
        public void f() {}
    }

    class EImpl2 implements E {
        @Override
        public void g() {}
        class EG implements E.G {
            @Override
            public void f() {}
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A.D ad = a.getD();
        a.getD().f();
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}