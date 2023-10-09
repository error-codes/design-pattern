package com.young.structural_pattern.$07_decorator;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 19:11
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {
        Cook cook = new Cook();
        CookDecorator cookDecorator = new CookDecorator(cook);
        cookDecorator.clothes();
        cookDecorator.work();

        Waiter waiter = new Waiter();
        WorkerDecorator workerDecorator = new WaiterDecorator(waiter);
        workerDecorator.clothes();
        workerDecorator.work();
    }
}
