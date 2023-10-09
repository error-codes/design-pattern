package com.young.behavioral_pattern.$14_command;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 15:21
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体命令类
 * * -
 */
public class TurnOffTVCommand implements Command {

    private final TV tv;

    public TurnOffTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
