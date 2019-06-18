package cn.file.序列化流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ObInputstream {
    public static void main(String[] args) throws Exception {

        ObjectInputStream os = new ObjectInputStream(new FileInputStream("D:\\360\\ab.txt"));
        Persion o = (Persion) os.readObject();
        System.out.println(o);
        os.close();

    }
}
