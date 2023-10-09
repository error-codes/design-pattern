package com.young.behavioral_pattern.$16_interator;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 16:47
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 迭代器接口
 * * -
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();

    T first();

    T last();
}
