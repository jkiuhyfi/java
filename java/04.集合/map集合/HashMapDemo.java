package map集合;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<>();
        map.put("1","陈");
        map.put("2","chen");
        map.put("3","江村经济");
       //遍历 map  keyset  键的视图
        for (String key:map.keySet()){
            System.out.println(map.get(key));
        }
        //值的视图
        for (Object v:map.values()){
            System.out.println(v);
        }
        //键与值 的视图
        for(Map.Entry<String,Object> entry:map.entrySet()){
            String key = entry.getKey();
            System.out.println(map.get(key));
        }


    }
}
