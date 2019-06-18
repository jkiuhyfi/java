package cn.file.缓存流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter1 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\360\\a.txt",true));
        bw.write("java天下第一");
        bw.newLine();
        bw.close();
    }
}
