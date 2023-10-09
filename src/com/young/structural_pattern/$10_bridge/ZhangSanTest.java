package com.young.structural_pattern.$10_bridge;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 11:02
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {
        Person man = new Man("Tom");
        Person woman = new Woman("Jerry");

        Tool fire = new Fire();
        Tool wood = new Wood();

        fire.useTool(woman);
        wood.useTool(man);

        man.setTool(wood);
        woman.setTool(fire);

        System.out.println(man);
        man.features();

        System.out.println(woman);
        woman.features();
    }
}
