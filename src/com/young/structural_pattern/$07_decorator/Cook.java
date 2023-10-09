package com.young.structural_pattern.$07_decorator;

import com.young.create_pattern.$04_builder.Person;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 18:49
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 具体组件
 * * -
 */
public class Cook implements Worker {

    @Override
    public void clothes() {
        System.out.print("厨师需要厨师服，");;
    }

    @Override
    public void work() {
        System.out.print("厨师需要制作菜品，");;
    }
}
