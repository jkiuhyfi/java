package cn.file.字节流io;

import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class 输出流2 {

    public static void main(String[] args) throws IOException {
        File file=new File("D:\\360\\abc.txt");
        FileImageOutputStream fos = new FileImageOutputStream(file);
        byte[] by={-65,66,67,68,69,70,71};
        //off 索引
        //写几个
        fos.write(by,1,3);
        fos.close();
    }
}
