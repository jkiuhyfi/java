package cn.file.propertils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class pro2 {

    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.setProperty("陈","www");
        pro.setProperty("陈1","w3ww");
        pro.setProperty("陈2","w3ww");
        FileWriter fileWriter = new FileWriter("D:\\360\\ad.txt");
        //写到硬盘
    //    System.out.println(pro);
        pro.store(fileWriter,"save");

        FileReader fileReader = new FileReader("D:\\360\\ad.txt");
        pro.load(fileReader);
        Set<String> key = pro.stringPropertyNames();
        for(String skey:key){
            System.out.println(pro.getProperty(skey));
        }


    }
}
