package cn.file.缓存流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferIn {

    public static void main(String[] args) throws Exception {

        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("D:\\360\\a.txt"));

        byte[] bytes=new byte[1024];
        int len=0;
        while ((len=bin.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

    }
}
