package cn.file.字节流io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class 输出流3 {

    public static void main(String[] args) throws IOException {
        File file=new File("D:\\360\\abc.txt");
        // true 追加，不替换
        FileOutputStream fos = new FileOutputStream(file,true);

        String str="陈开焕";
        byte[] bytes = str.getBytes();
        //将字符串转成字节
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes,0,3);
        fos.close();
    }
}
