package cn.file.字符流io;
// writer  字符输出流的顶级父类

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class WriterDemo01 {

    public static void main(String[] args) throws Exception {

        FileWriter fileWriter = new FileWriter("D:\\360\\abc.txt",true);

        char[] chars={'1','2'};
        //他跟字节流不同，他写入内存缓存中
        fileWriter.write(chars);
        //需要刷新一下
       // fileWriter.flush();
        //刷新再释放资源
        fileWriter.close();

    }
}
