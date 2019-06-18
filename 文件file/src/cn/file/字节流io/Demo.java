package cn.file.字节流io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo {

    public static void main(String[] args) throws Exception {
        //写
        FileOutputStream fop = new FileOutputStream("D:\\360\\250\\abc.txt");

        //读
        FileInputStream fin = new FileInputStream("D:\\360\\abc.txt");

        int len=0;
        byte[] b=new byte[1024];
        while ((len=fin.read(b))!=-1){
            fop.write(b,0,len);
        }



    }
}
