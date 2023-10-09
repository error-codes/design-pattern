package com.young.structural_pattern.$10_bridge;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 10:59
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 扩展具体抽象类
 * * -
 */
public class Fire extends Tool {

    @Override
    public String useTool(Person person) {
        return person.getName() + "用火烹饪食物或驱赶野兽";
    }
}
