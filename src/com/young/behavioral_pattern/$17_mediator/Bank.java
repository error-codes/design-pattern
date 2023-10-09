package com.young.behavioral_pattern.$17_mediator;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 17:34
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 抽象中介接口
 * * -
 */
public interface Bank {

    void transfer(Integer money, Account from, Account to);

    void addUser(Account account);
}
