package com.young.structural_pattern.$07_decorator;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 19:06
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体装饰类
 * * -
 */
public class WaiterDecorator extends WorkerDecorator {

    public WaiterDecorator(Worker worker) {
        super(worker);
    }

    @Override
    public void clothes() {
        super.clothes();
        System.out.println("服务员还需要传呼机");
    }

    @Override
    public void work() {
        super.work();
        System.out.println("服务员还需要上菜、拖地、刷碗");
    }
}
