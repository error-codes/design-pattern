package com.young.structural_pattern.$06_adapter;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 18:43
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {
        TypeCCharger typeCCharger = new TypeCChargerAdapter(new AppleCharger(), new USBCharger());
        typeCCharger.chargerWithTypeC();
    }
}
