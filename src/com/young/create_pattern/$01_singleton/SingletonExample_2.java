package com.young.create_pattern.$01_singleton;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 11:22
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 饿汉模式，线程安全
 * * -
 */
public class SingletonExample_2 {

    private static final SingletonExample_2 INSTANCE = new SingletonExample_2();

    private SingletonExample_2() {
    }

    public static SingletonExample_2 getInstance() {
        return INSTANCE;
    }
}
