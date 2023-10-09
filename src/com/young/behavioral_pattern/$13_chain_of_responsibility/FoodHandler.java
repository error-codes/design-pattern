package com.young.behavioral_pattern.$13_chain_of_responsibility;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 14:18
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class FoodHandler extends Handler{

    @Override
    public void HandlerRequest() {
        System.out.println("对清洗后的食材进行切块、腌制等预处理");
        nextHandler.HandlerRequest();
    }
}
