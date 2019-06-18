package cn.file.缓存流;

import com.sun.corba.se.impl.encoding.CodeSetConversion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferReader1 {

    public static void main(String[] args) throws Exception {


        BufferedReader bf = new BufferedReader(new FileReader("D:\\360\\a.txt"));

//        char[] bytes=new char[1024];
//        int len=0;
//        while ((len=bf.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }

        String len;
        while ((len=bf.readLine())!=null){
            System.out.println(len);
        }

        bf.close();

    }
}
