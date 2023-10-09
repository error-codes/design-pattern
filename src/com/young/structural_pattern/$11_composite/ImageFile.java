package com.young.structural_pattern.$11_composite;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 11:36
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 组件类
 * * -
 */
public class ImageFile implements FileSystemComponent {

    private final String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("ImageFile: " + name);
    }
}
