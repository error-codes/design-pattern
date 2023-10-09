package com.young.behavioral_pattern.$14_command;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 15:24
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {
        TV tv = new TV();
        Command turnOnTVCommand = new TurnOnTVCommand(tv);
        Command turnOffTVCommand = new TurnOffTVCommand(tv);
        Command adjustVolumeCommand = new AdjustVolumeCommand(tv, 10);
        RemoteControl turnOn = new RemoteControl(turnOnTVCommand);
        RemoteControl turnOff = new RemoteControl(turnOffTVCommand);
        RemoteControl adjustVolume = new RemoteControl(adjustVolumeCommand);

        turnOn.pressButton();
        turnOff.pressButton();
        adjustVolume.pressButton();
    }
}
