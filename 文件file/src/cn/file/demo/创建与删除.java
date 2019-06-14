package cn.file.demo;

import java.io.File;
import java.io.IOException;

public class 创建与删除 {

    public static void main(String[] args) throws IOException {
        //文件
       // File file = new File("D:\\360\\t.txt");
        //System.out.println(file.createNewFile());
      //  File file = new File("D:\\360\\250\\266\\55");
//        boolean mkdir = file.mkdirs();
//        System.out.println(mkdir);

        File file = new File("D:\\360\\250");
        boolean delete = file.delete();
        System.out.println(delete);

    }
}
