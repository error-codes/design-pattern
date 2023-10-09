package com.young.behavioral_pattern.$16_interator;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 16:53
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体可迭代对象类
 * * -
 */
public class YoungIterable<T> implements Iterable<T> {

    private T[] collection;
    private int index;

    public YoungIterable(T[] collection) {
        this.collection = collection;
        this.index = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new YoungIterator<>(collection);
    }

    @Override
    public T get(int index) {
        return collection[index];
    }

    @Override
    public int size() {
        return collection.length;
    }

    @Override
    public void add(T t) {
        collection[index++] = t;
    }
}
