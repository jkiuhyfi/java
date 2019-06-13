package conlletions工具类;


import java.util.ArrayList;
import java.util.Collections;

//查找  替换
public class Exaplem2 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        //向集合添加元素
        //  list.add("chen");
        list.add(1);
        list.add(2);
        list.add(11);
        list.add(22);
        // Collections.addAll(list,1,23,4);
        System.out.println("原来的元素" + list);
        System.out.println("最大值" + Collections.max(list));
        System.out.println("最小值" + Collections.min(list));
        Collections.replaceAll(list, 11, 11111);
        System.out.println(list);

    }
}
