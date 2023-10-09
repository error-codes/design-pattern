package com.young.behavioral_pattern.$15_interpreter;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 16:42
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {
        Context context = new Context("2 + 3");

        Expression expression = new AddExpression(
                new NumberExpression(Integer.parseInt(context.getInput().split(" ")[0])),
                new NumberExpression(Integer.parseInt(context.getInput().split(" ")[2]))
        );

        int interpreter = expression.interpreter(context);
        context.setOutput(interpreter);

        System.out.println(context.getInput() + " = " + context.getOutput());
    }
}
