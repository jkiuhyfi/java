package cn.file.转换流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utf_8 {

    public static void main(String[] args) throws IOException {

        FileReader freader = new FileReader("E:\\360\\ES6\\文件file\\src\\gpk编码.txt");


        int len;


        while ((len=freader.read())!=-1){
            System.out.println((char)len);
        }

        freader.close();

    }
}
