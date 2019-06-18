package cn.file.序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// 序列化:对象以流的方式写入  起到一个标志的作用
//反序列化:对象以流的方式读取
//  transient修饰变量不能变序列化
public class ObOutputSteam {

    public static void main(String[] args) throws IOException {


        ObjectOutputStream obs=new ObjectOutputStream(new FileOutputStream("D:\\360\\ab.txt"));

        obs.writeObject(new Persion("陈开焕",15));

        obs.close();

    }
}
