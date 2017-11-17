package com.huanyu.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleListTests {

    @Test
    public void sizeTest() {
        SimpleList<Integer> simpleList = new SimpleList<Integer>();
        assertEquals(simpleList.size(), 0);
    }
}
