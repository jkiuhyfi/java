package cn.file.字节流io;

import java.io.FileInputStream;

public class Inputstreamdemo {

    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("D:\\360\\abc.txt");

        byte[] r=new byte[1024];
//       int i=0;
//        while ((i=fi.read(r))!=-1){
//          //  System.out.println(new java.lang.String(r));
//        }

//        int read = fi.read(r);//返回他的长度
//        System.out.println(read);

        int i=0;
        while ((i=fi.read(r))!=-1){
            System.out.println(i);
            System.out.println(new String(r,0,i));
        }
        fi.close();

    }
}
