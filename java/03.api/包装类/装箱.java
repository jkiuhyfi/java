package 包装类;

public class 装箱 {

    public static void main(String[] args) {
        //基本类型  转成  包装类型  装箱
        //包装类型  转成   基本类型  拆箱
        int i = 9;
        Integer integer = new Integer(i);
        Integer integer1 = Integer.valueOf(i);
        System.out.println(integer1);

        //拆箱
        Integer integer2 = new Integer("20");
        int i1 = integer2.intValue();
        System.out.println(i1);
        // parint  string转成基本类型
        int parseInt = Integer.parseInt("25");

        System.out.println(parseInt);

    }
}
