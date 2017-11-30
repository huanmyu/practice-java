package com.huanyu.data.structure.array;

import java.util.Arrays;

public class SimpleList<T> {
    private Object[] elementData;
    private int size = 0;

    private final static int DEFAULT_LIST_CAPACITY = 4;

    public SimpleList() {
        elementData = new Object[DEFAULT_LIST_CAPACITY];
    }

    public SimpleList(Object[] elementData) {
        this.elementData = elementData;
    }

    public SimpleList(Object[] elementData, int size) {
        this.elementData = elementData;
        this.size = size;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(T e) {
        resize();
        elementData[size] = e;
        size = size + 1;
        return true;
    }

    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == o) {
                for (int j = i; j < size; j++) {
                    elementData[j] = elementData[j + 1];
                }
                size = size - 1;
                elementData[size] = 0;
                i--;
            }
        }
        return true;
    }

    public boolean delete(int index) {
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
        size = size - 1;
        elementData[size] = 0;
        return true;
    }

    public int[] removeReturnIndex(Object o) {
        StringBuilder s = new StringBuilder();
        int i = 1;
        for (Object element: elementData) {
            if (element == o) {
                s.append(i);
                s.append(",");
            }
            i++;
        }
        s.deleteCharAt(s.length() - 1);
        remove(o);
        String[] sIndexs = s.toString().split(",");
        int[] indexs = new int[sIndexs.length];
        for (int j = 0; j < sIndexs.length; j++) {
            indexs[j] = Integer.parseInt(sIndexs[j]);
        }
        return indexs;
    }

    public T get(int index) {
        return (T) elementData[index-1];
    }

    private void resize() {
        if (elementData.length == 0) {
            elementData = new Object[DEFAULT_LIST_CAPACITY];
            return;
        }

        int newCap = 0;
        if (elementData.length == size) {
            newCap = 2 * size;
        } else if (elementData.length / 4 > size) {
            newCap = elementData.length / 2;
        } else {
            return;
        }

        Object[] newElementData = new Object[newCap];
        for (int i = 0; i < size; i++) {
            newElementData[i] = elementData[i];
        }
        elementData = newElementData;
    }

    @Override
    public String toString() {
        return "SimpleList{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }
}
