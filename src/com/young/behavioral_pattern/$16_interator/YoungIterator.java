package com.young.behavioral_pattern.$16_interator;

import java.util.NoSuchElementException;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 16:48
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体迭代器类
 * * -
 */
public class YoungIterator<T> implements Iterator<T> {

    private T[] collection;
    private int index;

    public YoungIterator(T[] collection) {
        this.collection = collection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < collection.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return collection[index++];
    }

    @Override
    public T first() {
        return collection[0];
    }

    @Override
    public T last() {
        return collection[collection.length - 1];
    }
}
