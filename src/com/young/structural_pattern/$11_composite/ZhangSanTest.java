package com.young.structural_pattern.$11_composite;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 11:41
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * -
 * * -
 */
public class ZhangSanTest {

    public static void main(String[] args) {
        FileSystemComponent aTextFile = new TextFile("a.txt");
        FileSystemComponent bTextFile = new TextFile("b.word");
        FileSystemComponent aImageFile = new ImageFile("aaa.jpg");
        FileSystemComponent bImageFile = new ImageFile("bbb.png");
        FileSystemComponent aVideoFile = new VideoFile("aaaaaa.mp4");
        FileSystemComponent bVideoFile = new VideoFile("bbbbbb.flv");

        Folder folder = new Folder("young");
        folder.addComponents(aTextFile);
        folder.addComponents(bTextFile);
        folder.addComponents(aImageFile);
        folder.addComponents(bImageFile);
        folder.addComponents(aVideoFile);
        folder.addComponents(bVideoFile);

        folder.display();
    }
}
