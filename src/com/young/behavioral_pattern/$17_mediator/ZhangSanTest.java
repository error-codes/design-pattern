package com.young.behavioral_pattern.$17_mediator;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 18:14
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {
        Bank abc = new ABC();
        Bank icbc = new ICBC();

        Account zhangSan = new PersonAccount("张三", 10000, abc);
        Account chinaUnicom = new CompanyAccount("中国联通", 10000000, 100000, abc);

        // ------------------三月份------------------
        // 张三缴费
        abc.transfer(500, zhangSan, chinaUnicom);
        // 中国联通给张三发工资
        abc.transfer(10000, chinaUnicom, zhangSan);
        System.out.println("张三余额：" + zhangSan.getBalance());
        System.out.println("联通余额：" + chinaUnicom.getBalance());
        System.out.println("-------------------------------------");

        // ------------------四月份------------------
        // 张三想开个公司，并转到了 工商银行
        zhangSan.convert(icbc);
        // 张三缴费
        icbc.transfer(500, zhangSan, chinaUnicom);
        // 中国联通给张三发工资
        icbc.transfer(10000, chinaUnicom, zhangSan);
        System.out.println("张三余额：" + zhangSan.getBalance());
        System.out.println("联通余额：" + chinaUnicom.getBalance());
        System.out.println("-------------------------------------");


        // ------------------五月份------------------
        // 中国联通觉得 农业银行 手续费太多了，换成了工商银行
        // 张三缴费
        abc.transfer(500, zhangSan, chinaUnicom);
        // 中国联通给张三发工资
        icbc.transfer(10000, chinaUnicom, zhangSan);
        System.out.println("张三余额：" + zhangSan.getBalance());
        System.out.println("联通余额：" + chinaUnicom.getBalance());
        System.out.println("-------------------------------------");

        // ------------------六月份------------------
        // 要想少花钱，工商银行 必须得是公司账户，张三又申请了个公司账户
        zhangSan = new CompanyAccount("张三", zhangSan.getBalance(), zhangSan.getBalance() * 0.1, icbc);
        // 张三缴费
        icbc.transfer(500, zhangSan, chinaUnicom);
        // 中国联通给张三发工资
        icbc.transfer(10000, chinaUnicom, zhangSan);
        System.out.println("张三余额：" + zhangSan.getBalance());
        System.out.println("联通余额：" + chinaUnicom.getBalance());
        System.out.println("-------------------------------------");
    }
}
