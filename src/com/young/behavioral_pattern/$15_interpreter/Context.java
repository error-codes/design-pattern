package com.young.behavioral_pattern.$15_interpreter;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 15:47
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 上下文环境类
 * * -
 */
public class Context {

    private String input;
    private int    output;

    public Context(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
