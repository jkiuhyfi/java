package set集合;

import java.util.HashSet;
import java.util.Iterator;

public class StuMain {

    public static void main(String[] args) {
        Student student1 = new Student("1", "陈");
        Student student2 = new Student("2", "陈开");
        Student student3 = new Student("3", "陈");
        HashSet<Student> hashSet=new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        System.out.println(hashSet);
        Iterator<Student> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next);
        }
    }
}
