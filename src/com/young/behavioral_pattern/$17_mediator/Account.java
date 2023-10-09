package com.young.behavioral_pattern.$17_mediator;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 17:37
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 同事对象接口
 * * -
 */
public interface Account {

    Bank belong();

    void convert(Bank bank);

    String getName();

    double getBalance();

    void savingMoney(double amount);

    void withDrawMoney(double amount);
}
