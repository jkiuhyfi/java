package StringApi;

import java.util.Arrays;

public class StringApiDemo {

    public static void main(String[] args) {
        String str = "abckkaljiacce";

        //返回索引位置
        System.out.println("第一次索引的位置:" + str.indexOf("c"));
        System.out.println("最后索引的位置:" + str.lastIndexOf("c"));

        System.out.println("包含" + str.contains("ac"));

        //截取
        System.out.println(str.substring(2, 4));
        //分割
        String sr = "s+++d-ff-g";
        String replace = sr.replace("s", "jj");
        String[] splits = replace.split("-");
        //   System.out.println(splits);
        for (int i = 0; i < splits.length; i++) {
            System.out.println(splits[i]);
        }

        //将string转成byte类型
        String s="1111";
        byte[] bytes = s.getBytes();
        System.out.println("string转成byte"+Arrays.toString(bytes));
        //将string转成 int类型
//        byte b = Byte.parseByte(s);
//        System.out.println(b);

    }
}
