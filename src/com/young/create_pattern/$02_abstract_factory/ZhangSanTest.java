package com.young.create_pattern.$02_abstract_factory;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 14:50
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {
        IAnimalFactory virtualAnimalFactory = new VirtualAnimalFactory();
        ICat helloKitty = virtualAnimalFactory.createCat();
        helloKitty.eat();

        IDog alphaDog = virtualAnimalFactory.createDog();
        alphaDog.eat();


        RealAnimalFactory realAnimalFactory = new RealAnimalFactory();
        ICat juMao = realAnimalFactory.createCat();
        juMao.eat();

        IDog cheems = realAnimalFactory.createDog();
        cheems.eat();
    }

}
