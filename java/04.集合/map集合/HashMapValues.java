package map集合;

import java.util.HashMap;
import java.util.Map;

public class HashMapValues {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("1", "陈");
        map.put("2", "chen");
        map.put("3", "江村经济");
        System.out.println("原来" + map);
        for (Object o : map.values()) {
            System.out.println(o);
        }
    }
}
