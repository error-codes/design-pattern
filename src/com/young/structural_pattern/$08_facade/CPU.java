package com.young.structural_pattern.$08_facade;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 19:26
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 组件类
 * * -
 */
public class CPU {

    public void execute() {
        System.out.println("CPU 正在快速执行");
    }

    public void useRate() {
        System.out.println("当前 CPU 使用率为： " + Format.formatFlo(Math.random() * 90 + 10) + " %");
    }
}
