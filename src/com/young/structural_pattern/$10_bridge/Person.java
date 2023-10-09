package com.young.structural_pattern.$10_bridge;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 10:51
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 抽象类
 * * -
 */
public abstract class Person {

    private Tool tool;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("人类和动物的区别是人类会使用工具");
    }

    public abstract void features();

    @Override
    public String toString() {
        return "Person{" +
                "tool=" + tool.useTool(this) +
                ", name='" + name + '\'' +
                '}';
    }
}
