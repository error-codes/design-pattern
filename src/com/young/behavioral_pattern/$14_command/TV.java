package com.young.behavioral_pattern.$14_command;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 15:19
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 接收者类
 * * -
 */
public class TV {

    public void turnOn() {
        System.out.println("电视已打开");
    }

    public void turnOff() {
        System.out.println("电视已关闭");
    }

    public void setVolume(int volume) {
        System.out.println("电视音量已调整至：" + volume);
    }
}
