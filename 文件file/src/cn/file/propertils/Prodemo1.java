package cn.file.propertils;

import java.util.Properties;
import java.util.Set;

public class Prodemo1 {

    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {


    }

    private static void show01() {
        Properties properties = new Properties();

        //设置
        properties.setProperty("chen","称号你你你");
        properties.setProperty("chen12","称号你你33你");
        properties.setProperty("chen33","称号你你44你");

        Set<String> key = properties.stringPropertyNames(); //遍历他的key
        for(String s:key){
            System.out.println(properties.getProperty(s));
        }
    }
}
