package com.young.behavioral_pattern.$15_interpreter;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 15:49
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 终结符表达式类
 * * -
 */
public class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpreter(Context context) {
        return number;
    }
}
