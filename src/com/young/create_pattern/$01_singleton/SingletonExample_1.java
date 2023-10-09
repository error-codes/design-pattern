package com.young.create_pattern.$01_singleton;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 11:19
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 懒汉模式，线程不安全
 * * -
 */
public class SingletonExample_1 {

    private static SingletonExample_1 INSTANCE;

    private SingletonExample_1() {
    }

    // 如果存在多线程调用，可能会创建多个对象
    public static SingletonExample_1 getInstance1() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonExample_1();
        }
        return INSTANCE;
    }


}
