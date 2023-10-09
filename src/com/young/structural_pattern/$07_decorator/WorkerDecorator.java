package com.young.structural_pattern.$07_decorator;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 19:02
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 抽象装饰类
 * * -
 */
public class WorkerDecorator implements Worker {

    protected Worker decoratorWorker;

    public WorkerDecorator(Worker worker) {
        this.decoratorWorker = worker;
    }

    @Override
    public void clothes() {
        decoratorWorker.clothes();
    }

    @Override
    public void work() {
        decoratorWorker.work();
    }
}
