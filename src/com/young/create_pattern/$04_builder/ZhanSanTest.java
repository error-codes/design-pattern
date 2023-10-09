package com.young.create_pattern.$04_builder;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 16:52
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhanSanTest {

    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();

        Person person = personDirector.constructPerson(new ManBuilder());
        System.out.println(person);
    }
}
