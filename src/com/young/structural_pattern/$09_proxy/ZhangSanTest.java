package com.young.structural_pattern.$09_proxy;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 10:37
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {
        ArticleInterface houseAgentProxy = new HouseAgentProxy(3000000);
        houseAgentProxy.sell();
    }
}
