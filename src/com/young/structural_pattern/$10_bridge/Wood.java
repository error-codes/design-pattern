package com.young.structural_pattern.$10_bridge;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 11:00
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 扩展具体抽象类
 * * -
 */
public class Wood extends Tool {

    @Override
    public String useTool(Person person) {
        return person.getName() + "用木枪狩猎或防卫";
    }
}
