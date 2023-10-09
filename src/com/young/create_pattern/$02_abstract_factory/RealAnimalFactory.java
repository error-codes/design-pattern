package com.young.create_pattern.$02_abstract_factory;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 14:19
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体工厂类
 * * -
 */
public class RealAnimalFactory implements IAnimalFactory {

    @Override
    public ICat createCat() {
        return new RealCatJuMao();
    }

    @Override
    public IDog createDog() {
        return new RealDogCheems();
    }
}
