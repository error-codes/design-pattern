package com.young.behavioral_pattern.$13_chain_of_responsibility;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 14:10
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 抽象拦截处理类
 * * -
 */
public abstract class Handler {

    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void HandlerRequest();
}
