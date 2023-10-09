package com.young.create_pattern.$02_abstract_factory;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 14:20
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体工厂类
 * * -
 */
public class VirtualAnimalFactory implements IAnimalFactory {

    @Override
    public ICat createCat() {
        return new VirtualCatHelloKitty();
    }

    @Override
    public IDog createDog() {
        return new VirtualDogAlphaDog();
    }
}
