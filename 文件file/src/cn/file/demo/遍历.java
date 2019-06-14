package cn.file.demo;

import java.io.File;

public class 遍历 {
    public static void main(String[] args) {
        File file = new File("D:\\360");
//        String[] list = file.list();
//        for(String f:list){
//            System.out.println(f);
//        }
        File[] files = file.listFiles();
        for (File file1:files){
            System.out.println(file1);
        }

    }
}
