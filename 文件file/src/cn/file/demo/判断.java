package cn.file.demo;

import java.io.File;

public class 判断 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\url.txt");
        System.out.println("判断是文件"+file.isFile());
        System.out.println("判断是目录"+file.isDirectory());
        System.out.println("判断构造方法的路径"+file.exists());
    }
}
