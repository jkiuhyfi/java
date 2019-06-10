package map集合;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hashTableDemo {
    public static void main(String[] args) {
        //hashtable属于线程安全，效率较低
        Map<String,String> map=new Hashtable<>();
        map.put("1","陈");
        map.put("2","开");
        map.put("3","焕");
        System.out.println(map);
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());//获得他的key
            System.out.println(entry.getValue());
        }




    }
}
