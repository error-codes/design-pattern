package com.young.structural_pattern.$08_facade;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 19:25
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 门面类
 * * -
 */
public class ComputerFacade {

    private CPU    cpu;
    private Memory memory;
    private Disk   disk;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startComputer() {
        cpu.execute();
        cpu.useRate();
        memory.freeSize();
        memory.useRate();
        disk.freeSize();
        disk.useRate();
    }
}
