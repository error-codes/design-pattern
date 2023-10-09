package com.young.behavioral_pattern.$15_interpreter;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 16:40
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 非终结符表达式类
 * * -
 */
public class AddExpression implements Expression {
    private Expression left;
    private Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {
        return left.interpreter(context) + right.interpreter(context);
    }
}
