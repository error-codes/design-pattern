package com.young.behavioral_pattern.$13_chain_of_responsibility;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 14:22
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {

        Handler clean = new CleanHandler();
        Handler food = new FoodHandler();
        Handler cook = new CookHandler();
        Handler dish = new DishHandler();
        clean.setNextHandler(food);
        food.setNextHandler(cook);
        cook.setNextHandler(dish);

        clean.HandlerRequest();
    }
}
