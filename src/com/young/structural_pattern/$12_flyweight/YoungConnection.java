package com.young.structural_pattern.$12_flyweight;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 13:47
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体享元类
 * * -
 */
public class YoungConnection implements Connection {

    private int    x;
    private int    y;
    private int    result;
    private String type;

    public YoungConnection(String type) {
        this.type = type;
    }

    @Override
    public void execute(int x, int y) {
        switch (type) {
            case "sum" -> result += x + y;
            case "sub" -> result += x - y;
            case "mul" -> result += x * y;
            case "div" -> result += x / y;
            default -> throw new RuntimeException("type is invalid");
        }
        System.out.println(result);
    }
}
