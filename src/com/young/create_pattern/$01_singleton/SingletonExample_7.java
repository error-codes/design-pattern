package com.young.create_pattern.$01_singleton;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 13:35
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 枚举模式，线程安全，而且是最安全，防止反射和序列化攻击
 * * -
 */
public class SingletonExample_7 {

    private SingletonExample_7() {
    }

    public static SingletonExample_7 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {

        INSTANCE;

        private SingletonExample_7 singletonExample;

        Singleton() {
            singletonExample = new SingletonExample_7();
        }

        public SingletonExample_7 getInstance() {
            return singletonExample;
        }
    }
}

