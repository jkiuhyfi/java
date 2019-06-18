package cn.file.字节流io;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileInputStream;

public class 输入流2 {

    public static void main(String[] args) throws Exception {

        FileInputStream fi = new FileInputStream("D:\\360\\abc.txt");

        byte[] r=new byte[1024];
//       int i=0;
//        while ((i=fi.read(r))!=-1){
//          //  System.out.println(new java.lang.String(r));
//        }

        int read = fi.read(r);
        System.out.println(read);
        fi.close();


    }
}
