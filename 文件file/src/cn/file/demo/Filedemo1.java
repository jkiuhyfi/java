package cn.file.demo;



import java.io.File;

public class Filedemo1 {

    public static void main(String[] args) {

        //分隔符
        System.out.println(File.separator);

        showfile(); //构造方式
    }

    private static void showfile() {
        File file = new File("C:\\Users\\Administrator\\Desktop\\url.txt");

        System.out.println(file);
    }
}
