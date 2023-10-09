package com.young.create_pattern.$05_prototype;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 17:22
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 抽象原型类
 * * -
 */
public abstract class Animal implements Cloneable {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Animal cloneAnimal();
}
