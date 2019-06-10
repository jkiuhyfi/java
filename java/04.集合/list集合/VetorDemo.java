package list集合;

import java.util.Iterator;
import java.util.Vector;

public class VetorDemo {

    public static void main(String[] args) {
        //他与arraylist他是线程安全
        Vector<String> vector = new Vector<>();
        vector.add("陈");
        vector.add("开");
        Iterator<String> iterator = vector.iterator();//获得迭代器
        while (iterator.hasNext()){
            String next = iterator.next();
            if("陈".equals(next)){
                vector.remove(next);
                break;
            }
            System.out.println(next);
        }
        System.out.println(vector);
    }
}
