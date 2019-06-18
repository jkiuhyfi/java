package cn.file.字符流io;

import java.io.FileNotFoundException;
import java.io.FileReader;

// Reader 是输入字符流的顶级父类
// 字符流处理中文  字节流处理英文
public class ReaderDemo01 {

    public static void main(String[] args) throws Exception {
        //字符输入流
        FileReader freader = new FileReader("D:\\360\\abc.txt");
        //读取
        char[] chars=new char[1024];
        int len=0;
        while ((len=freader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
    }
}
