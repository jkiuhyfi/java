package conlletions工具类;


import java.util.ArrayList;
import java.util.Collections;

//排序
public class Exaplem {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //向集合添加元素
        //  list.add("chen");
        list.add("1");
        list.add("12");
        list.add("13");
        list.add("14");
        //排序
//        Collections.sort(list);
//        System.out.println("正序"+list);
//        Collections.reverse(list);
//        System.out.println("反序"+list);
//        System.out.println(Collections.max(list));
//        Collections.replaceAll(list,"1","222");
//        System.out.println(list);
        System.out.println(list);
        Collections.swap(list, 0, 2);
        System.out.println(list);


    }
}
