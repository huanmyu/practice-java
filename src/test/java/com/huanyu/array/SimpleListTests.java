package com.huanyu.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SimpleListTests {

    private static SimpleList<Integer> simpleList = new SimpleList<Integer>();

    static {
        simpleList.add(1);
        simpleList.add(2);
        simpleList.add(3);
        simpleList.add(4);
        simpleList.add(2);
        simpleList.add(2);
    }

    @Test
    public void sizeTest() {
        assertEquals(simpleList.size(), 6);
    }

    @Test
    public void isEmptyTest() {
        assertEquals(simpleList.isEmpty(), false);
    }

    @Test
    public void removeTest() {
        simpleList.remove(2);
        assertEquals(simpleList.size(), 3);
    }

    @Test
    public void removeReturnIndexTest() {
        int[] indexs = simpleList.removeReturnIndex(2);
        assertArrayEquals(indexs, new int[]{2, 5, 6});
    }

    @Test
    public void getTest() {
        assertEquals((Object)simpleList.get(2), 2);
    }
}
