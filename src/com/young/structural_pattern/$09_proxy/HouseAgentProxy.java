package com.young.structural_pattern.$09_proxy;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 10:34
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 代理类
 * * -
 */
public class HouseAgentProxy implements ArticleInterface {

    private final HouseRealArticle houseRealArticle;
    private final Integer          commission;

    public HouseAgentProxy(Integer sell) {
        this.houseRealArticle = new HouseRealArticle(sell);
        this.commission = sell / 12;
    }

    @Override
    public void sell() {
        houseRealArticle.sell();
        Integer price = houseRealArticle.getPrice();
        System.out.println("房屋对外售价：" + (price + commission));
    }
}
