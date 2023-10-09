package com.young.behavioral_pattern.$16_interator;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 16:57
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {

        Integer[] array = new Integer[7];
        Iterable<Integer> youngIterable = new YoungIterable<>(array);
        youngIterable.add(1);
        youngIterable.add(3);
        youngIterable.add(2);
        youngIterable.add(5);
        youngIterable.add(7);
        youngIterable.add(4);
        youngIterable.add(6);

        Iterator<Integer> iterator = youngIterable.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("--------------------------------------");

        System.out.println(iterator.first());
        System.out.println(iterator.last());
    }
}
