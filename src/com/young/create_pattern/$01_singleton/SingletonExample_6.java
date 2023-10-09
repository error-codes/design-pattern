package com.young.create_pattern.$01_singleton;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 13:33
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 饿汉模式，静态代码块创建，线程安全
 * * -
 */
public class SingletonExample_6 {

    private static volatile SingletonExample_6 INSTANCE;

    private SingletonExample_6() {
    }

    static {
        INSTANCE = new SingletonExample_6();
    }

    public static SingletonExample_6 getInstance2() {
        return INSTANCE;
    }
}
