package com.young.create_pattern.$04_builder;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 16:27
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 抽象构建类
 * * -
 */
public interface PersonBuilder {

    void buildHead(String head);

    void buildBody(String body);

    void buildFoot(String foot);

    Person buildPerson();
}
