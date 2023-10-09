package com.young.structural_pattern.$07_decorator;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 18:46
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体组件
 * * -
 */
public class Waiter implements Worker {

    @Override
    public void clothes() {
        System.out.print("服务员需要工作服，");
    }

    @Override
    public void work() {
        System.out.print("服务员需要服务顾客，");
    }
}
