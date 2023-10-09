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
public class Disk {

    public void freeSize() {
        System.out.println("Disk 剩余 " + Format.formatInt(Math.random() * 1000 + 500) + " GB");
    }

    public void useRate() {
        System.out.println("当前 Disk 使用率为： " + Format.formatFlo(Math.random() * 10 + 2) + " %");
    }
}
