package com.young.create_pattern.$03_factory_method;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 15:28
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体工厂类
 * * -
 */
public class StudentWorkFactory implements IWorkFactory {

    @Override
    public Work getWork() {
        return new StudentWork();
    }
}
