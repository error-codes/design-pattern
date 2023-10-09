package com.young.create_pattern.$01_singleton;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 13:17
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 懒汉模式，DCL(Double Check Lock) 降低锁粒度 + Volatile，提升部分性能并保证线程安全
 * * -
 */
public class SingletonExample_5 {

    private static volatile SingletonExample_5 INSTANCE;

    private SingletonExample_5() {
    }

    public static SingletonExample_5 getInstance2() {
        if (INSTANCE == null) {
            synchronized (SingletonExample_5.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonExample_5();
                }
            }
        }
        return INSTANCE;
    }
}
