package com.young.behavioral_pattern.$16_interator;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 16:52
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 可迭代对象接口
 * * -
 */
public interface Iterable<T> {

    Iterator<T> iterator();

    T get(int index);

    int size();

    void add(T t);
}
