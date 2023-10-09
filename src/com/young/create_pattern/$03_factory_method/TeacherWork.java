package com.young.create_pattern.$03_factory_method;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 15:25
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体产品类
 * * -
 */
public class TeacherWork implements Work {

    @Override
    public void doWork() {
        System.out.println("老师批改作业");
    }
}
