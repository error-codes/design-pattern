package com.young.structural_pattern.$06_adapter;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 18:22
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 适配器类
 * * -
 */
public class TypeCChargerAdapter implements TypeCCharger {

    private final AppleCharger appleCharger;

    private final USBCharger usbCharger;

    public TypeCChargerAdapter(AppleCharger appleCharger, USBCharger usbCharger) {
        this.appleCharger = appleCharger;
        this.usbCharger = usbCharger;
    }


    @Override
    public void chargerWithTypeC() {
        appleCharger.chargerWithApple();
        usbCharger.chargerWithUSB();
    }
}
