package com.young.structural_pattern.$10_bridge;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 10:53
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体抽象类
 * * -
 */
public class Woman extends Person {

    public Woman(String name) {
        super(name);
    }

    @Override
    public void features() {
        System.out.println(getName() + "有🐻");
    }
}
