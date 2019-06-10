package set集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
// hashset: 无序  不可以重复

//equals:判断对象的属性是否相等
// hashcode:返回的哈希值,计算出对象的存储位置
public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
       set.add("1");
       set.add("超能");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }


    }
}
