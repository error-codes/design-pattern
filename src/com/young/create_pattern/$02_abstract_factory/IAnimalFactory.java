package com.young.create_pattern.$02_abstract_factory;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 14:15
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 抽象工厂类
 * * -
 */
public interface IAnimalFactory {

    ICat createCat();

    IDog createDog();
}
