package com.young.behavioral_pattern.$17_mediator;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 17:43
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体同事对象类
 * * -
 */
public class PersonAccount implements Account {

    private final String account;
    private       double balance;
    private       Bank   bank;

    public PersonAccount(String account, double balance, Bank bank) {
        this.account = account;
        this.balance = balance;
        this.bank = bank;
    }

    @Override
    public Bank belong() {
        return bank;
    }

    @Override
    public void convert(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String getName() {
        return account;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void savingMoney(double amount) {
        balance += amount;
    }

    @Override
    public void withDrawMoney(double amount) {
        if (amount > balance) {
            throw new RuntimeException("账户余额不足");
        }
        balance -= amount;
    }
}
