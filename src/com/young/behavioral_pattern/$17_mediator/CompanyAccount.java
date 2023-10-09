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
public class CompanyAccount implements Account {

    private final String company;
    private       double balance;
    private       double loan;
    private final double credit;
    private       Bank   bank;

    public CompanyAccount(String company, double balance, double credit, Bank bank) {
        this.company = company;
        this.balance = balance;
        this.loan = credit;
        this.credit = credit;
        this.bank = bank;
    }

    @Override
    public Bank belong() {
        return bank;
    }

    public void convert(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String getName() {
        return company;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void savingMoney(double amount) {
        if (amount > loan) {
            balance += amount - loan;
        } else {
            loan -= amount;
        }
    }

    @Override
    public void withDrawMoney(double amount) {
        if (loan == 0) {
            throw new RuntimeException("账户已被冻结");
        }
        if (balance > amount) {
            balance -= amount;
        } else {
            if (balance + credit - loan > amount) {
                loan += amount - balance;
                balance = 0;
            } else {
                throw new RuntimeException("账户余额及可借贷款额不足");
            }
        }
    }
}
