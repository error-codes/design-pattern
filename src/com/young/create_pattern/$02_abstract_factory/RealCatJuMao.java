package com.young.create_pattern.$02_abstract_factory;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 14:43
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体产品类
 * * -
 */
public class RealCatJuMao implements ICat {

    @Override
    public void eat() {
        System.out.println("家里的橘猫正在吃猫粮");
    }
}
