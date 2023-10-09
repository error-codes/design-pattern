package com.young.behavioral_pattern.$14_command;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 15:22
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体命令类
 * * -
 */
public class AdjustVolumeCommand implements Command {

    private final TV  tv;
    private final int volume;

    public AdjustVolumeCommand(TV tv, int volume) {
        this.tv = tv;
        this.volume = volume;
    }

    @Override
    public void execute() {
        tv.setVolume(volume);
    }
}
