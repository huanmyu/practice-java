package com.huanyu.base.inner.sequence;

/*
 * 如果不添加public关键字，只有包访问权限。
 * 接口可以包含域，它们隐式地是static和final的。
 * 接口的方法默认是public的。
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
