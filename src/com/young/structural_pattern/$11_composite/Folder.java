package com.young.structural_pattern.$11_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 11:39
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 组合类
 * * -
 */
public class Folder implements FileSystemComponent {

    private String                    name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponents(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name);
        System.out.println(name + " 目录下有以下文件：");
        for (FileSystemComponent component : components) {
            component.display();
        }
        System.out.println("-------------------------------------");
    }
}
