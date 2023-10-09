package com.young.create_pattern.$05_prototype;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 18:10
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {
        Animal animal = new Dog("Doge");
        Animal cloneAnimal = animal.cloneAnimal();
        System.out.println(animal.getName());
        System.out.println(cloneAnimal.getName());
    }
}
