package cn.file.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class 输出流 {
    public static void main(String[] args) throws Exception {

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\360\\abc.txt");

        fileOutputStream.write(97);
        fileOutputStream.close();

    }
}
