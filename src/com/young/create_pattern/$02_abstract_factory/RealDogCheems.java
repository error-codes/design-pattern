package com.young.create_pattern.$02_abstract_factory;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 14:47
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class RealDogCheems implements IDog {

    @Override
    public void eat() {
        System.out.println("Cheems 去世了，吃不了主人准备的骨头了");
    }
}
