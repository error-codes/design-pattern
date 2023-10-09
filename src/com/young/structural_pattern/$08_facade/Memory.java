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
public class Memory {

    public void freeSize() {
        System.out.println("Memory 剩余 " + Format.formatInt(Math.random() * 64000 + 500) + " MB");
    }

    public void useRate() {
        System.out.println("当前 Memory 使用率为： " + Format.formatFlo(Math.random() * 100 + 10) + " %");
    }
}
