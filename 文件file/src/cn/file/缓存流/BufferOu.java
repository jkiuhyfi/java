package cn.file.缓存流;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferOu {

    public static void main(String[] args) throws Exception {

        BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream("D:\\360\\a.txt"));

        bs.write("写入".getBytes());
        bs.close();
    }
}
