package com.young.behavioral_pattern.$14_command;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 15:23
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 调用者类
 * * -
 */
public class RemoteControl {

    private Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
