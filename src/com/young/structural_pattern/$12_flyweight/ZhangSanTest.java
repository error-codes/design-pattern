package com.young.structural_pattern.$12_flyweight;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 13:55
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection1 = connectionFactory.getConnection("sum");
        connection1.execute(1, 1);
        Connection connection2 = connectionFactory.getConnection("sum");
        connection2.execute(1, 1);
        Connection connection3 = connectionFactory.getConnection("sub");
        connection3.execute(1, 9);
        Connection connection4 = connectionFactory.getConnection("sub");
        connection3.execute(1, -10);
        Connection connection5 = connectionFactory.getConnection("mul");
        connection5.execute(10, 10);
        Connection connection6 = connectionFactory.getConnection("mul");
        connection6.execute(9, 9);
        Connection connection7 = connectionFactory.getConnection("div");
        connection7.execute(100, 10);
        Connection connection8 = connectionFactory.getConnection("div");
        connection8.execute(-1000, 10);
    }
}
