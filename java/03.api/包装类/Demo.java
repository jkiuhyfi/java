package 包装类;

public class Demo {

    public static void main(String[] args) {
        // 静态  string--->基本类型
        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println(i);
        //包装类型  与基本类型
        Integer integer = Integer.valueOf(i);
        System.out.println(integer);
        int ll = integer.intValue();
        System.out.println(ll);
    }
}
