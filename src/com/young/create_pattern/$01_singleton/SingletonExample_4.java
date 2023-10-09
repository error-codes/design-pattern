package com.young.create_pattern.$01_singleton;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 11:29
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 懒汉模式，DCL(Double Check Lock) 降低锁粒度，提升部分性能，线程不安全
 * * -
 */
public class SingletonExample_4 {

    private static SingletonExample_4 INSTANCE;

    private SingletonExample_4() {
    }

    // 线程不安全
    // 当执行instance = new SingletonExample4();这行代码时，CPU会执行如下指令：
    // 1.memory = allocate() 分配对象的内存空间
    // 2.ctorInstance() 初始化对象
    // 3.instance = memory 设置instance指向刚分配的内存
    // 单纯执行以上三步没啥问题，但是在多线程情况下，可能会发生指令重排序。
    // 指令重排序对单线程没有影响，单线程下CPU可以按照顺序执行以上三个步骤，但是在多线程下，如果发生了指令重排序，则会打乱上面的三个步骤。

    // 如果发生了 JVM 和 CPU 优化，发生重排序时，可能会按照下面的顺序执行：
    // 1.memory = allocate() 分配对象的内存空间
    // 3.instance = memory 设置 instance 指向刚分配的内存
    // 2.ctorInstance() 初始化对象


    // 假设目前有两个线程 A 和 B 同时执行 getInstance() 方法，A 线程执行到 instance = new SingletonExample4();
    // B线程刚执行到第一个 if (instance == null) 处，
    // 如果按照 1 -> 3 -> 2 的顺序，假设线程 A 执行到 3.instance = memory 设置 instance 指向刚分配的内存，
    // 此时，线程 B 判断 instance 已经有值，就会直接 return instance;
    // 而实际上，线程 A 还未执行 2.ctorInstance() 初始化对象，也就是说线程 B 拿到的 instance 对象还未进行初始化，这个未初始化的 instance 对象一旦被线程B使用，就会出现问题。

    // 降低锁粒度，提升性能，但是由于指令重排序，导致线程不安全
    public static SingletonExample_4 getInstance2() {
        if (INSTANCE == null) {
            synchronized (SingletonExample_4.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonExample_4();
                }
            }
        }
        return INSTANCE;
    }
}
