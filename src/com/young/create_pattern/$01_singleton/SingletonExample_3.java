package com.young.create_pattern.$01_singleton;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 11:28
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 懒汉模式，线程安全
 * * -
 */
public class SingletonExample_3 {

    private static SingletonExample_3 INSTANCE;

    private SingletonExample_3() {
    }

    // 线程安全的调用方法，但是存在SYNC锁，导致性能降低
    public static synchronized SingletonExample_3 getInstance2() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonExample_3();
        }
        return INSTANCE;
    }
}
