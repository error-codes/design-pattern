package com.young.behavioral_pattern.$17_mediator;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 18:02
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体中介对象类
 * * -
 */
public class ABC implements Bank {

    private static final double PERSON_PREMIUM  = 0.01;
    private static final double COMPANY_PREMIUM = 0.10;

    @Override
    public void transfer(Integer money, Account from, Account to) {
        if (to instanceof PersonAccount) {
            if (to.belong() instanceof ABC) {
                from.withDrawMoney(money);
                to.savingMoney(money);
            } else {
                from.withDrawMoney(money * (1 + PERSON_PREMIUM));
                to.savingMoney(money);
            }
        } else {
            if (to.belong() instanceof ABC) {
                from.withDrawMoney(money * (1 + PERSON_PREMIUM));
                to.savingMoney(money);
            } else {
                from.withDrawMoney(money * (1 + COMPANY_PREMIUM));
                to.savingMoney(money);
            }
        }
    }

    @Override
    public void addUser(Account account) {
        account.convert(this);
    }
}
