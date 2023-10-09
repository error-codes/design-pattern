package com.young.behavioral_pattern.$13_chain_of_responsibility;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 14:19
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class CookHandler extends Handler{

    @Override
    public void HandlerRequest() {
        System.out.println("对预处理后的食材进行烹饪");
        nextHandler.HandlerRequest();
    }
}
