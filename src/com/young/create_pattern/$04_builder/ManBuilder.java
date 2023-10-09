package com.young.create_pattern.$04_builder;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 16:29
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体构建类
 * * -
 */
public class ManBuilder implements PersonBuilder {

    Man man;

    public ManBuilder() {
        this.man = new Man();
    }

    @Override
    public void buildHead(String head) {
        man.setHead("建造男人的" + head);
    }

    @Override
    public void buildBody(String body) {
        man.setBody("建造男人的" + body);
    }

    @Override
    public void buildFoot(String foot) {
        man.setFoot("建造男人的" + foot);
    }

    @Override
    public Person buildPerson() {
        return man;
    }
}
