package cn.file.demo;

import java.io.File;

public class 获取文件 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Administrator\\Desktop\\url.txt");

        System.out.println("获得他的相对路径"+file.getPath());
        System.out.println("获得他的绝对路径"+file.getAbsolutePath());
        System.out.println("获得文件名"+file.getName());
        System.out.println("获得文件的大小"+file.length());
    }
}
