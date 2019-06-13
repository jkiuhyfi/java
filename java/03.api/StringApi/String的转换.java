package StringApi;

public class String的转换 {

    public static void main(String[] args) {
        Object ob = new int[122];
        // tostring(对象不能为空)  String.valuesof(底层代码自带判空)
        String toString = ob.toString();
        String sv = String.valueOf(ob);
        System.out.println(toString);
        System.out.println(sv);

    }
}
