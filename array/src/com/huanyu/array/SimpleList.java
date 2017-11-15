package com.huanyu.array;

public class SimpleList<T> {
    private Object[] elementData;
    private int size = 0;

    private final static int DEFAULT_LIST_CAPACITY = 10;

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
        return size > 0;
    }

    public boolean add(T e) {
        resize();
        elementData[size] = e;
        size = size + 1;
        return true;
    }

    public boolean remove(Object o) {
        for (Object element: elementData) {
            int i = 0;
            if (element == o) {
                for (int j = i; j < size; j++) {
                    elementData[j] = elementData[j + 1];
                }
            }
            i++;
        }
        resize();
        return true;
    }

    public T get(int index) {
        resize();
        return (T) elementData[index];
    }

    private void resize() {
        if (elementData.length == 0) {
            elementData = new Object[DEFAULT_LIST_CAPACITY];
        } else if (elementData.length == size) {
            int newCap = 2 * size;
            elementData = new Object[newCap];
        } else if (elementData.length / 4 > size) {
            int newCap = elementData.length / 2;
            elementData = new Object[newCap];
        }
    }
}
