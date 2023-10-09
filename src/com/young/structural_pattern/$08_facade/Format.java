package com.young.structural_pattern.$08_facade;

import java.text.DecimalFormat;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 19:40
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class Format {

    public static final DecimalFormat integerFormat = new DecimalFormat("0");

    public static final DecimalFormat floatFormat = new DecimalFormat("0.00");

    public static String formatInt(double value) {
        return integerFormat.format(value);
    }

    public static String formatFlo(double value) {
        return floatFormat.format(value);
    }
}
