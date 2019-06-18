package cn.file.字节流io;

import java.io.FileInputStream;

public class 输入流1 {

    public static void main(String[] args) throws Exception {

        FileInputStream fi = new FileInputStream("D:\\360\\abc.txt");

        int i=0;
        //  -1表示读取完毕
        while ((i=fi.read())!=-1){
            System.out.println(i);
        }
        fi.close();


    }
}
