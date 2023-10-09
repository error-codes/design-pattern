package com.young.structural_pattern.$09_proxy;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 10:28
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体被代理类
 * * -
 */
public class HouseRealArticle implements ArticleInterface {

    private Integer price;

    public HouseRealArticle(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public void sell() {
        System.out.println("房屋售价：" + price);
    }
}
