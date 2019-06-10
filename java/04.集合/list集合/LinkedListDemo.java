package list集合;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        //链表:底层是链表 增  删  速度快
        LinkedList<String> list = new java.util.LinkedList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        System.out.println(list);
        //添加
         list.addFirst("陈");
         list.addLast("焕");
         //删除
         list.removeFirst();
        System.out.println(list);
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
             //取出元素
            String next = iterator.next();
            if(next.equals("陈")){
                list.remove(next);
                break;
            }
            System.out.println(next);
        }

    }
}
