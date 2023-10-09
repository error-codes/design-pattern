package com.young.create_pattern.$05_prototype;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 17:23
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体抽象类
 * * -
 */
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public Animal cloneAnimal() {
        Dog clone = new Dog();
        clone.setName(this.name);
        return clone;
    }
}
