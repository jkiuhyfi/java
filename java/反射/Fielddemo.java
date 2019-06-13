package 反射;

import java.lang.reflect.Field;

public class Fielddemo {

    public static void main(String[] args) throws Exception {
        Persion persion = new Persion();
        //获得class对象
        Class<Persion> persionClass = Persion.class;

        //对修饰符 public 有效
        Field[] fields = persionClass.getFields();
        for (Field field : fields) {
            ;
            field.set(persion, "11");
            System.out.println(persion);

        }

        System.out.println("=====================");

        //不考虑修饰符
        Field[] declaredFields = persionClass.getDeclaredFields();
        for (Field field : declaredFields) {
            //忽略 修饰符 private的作用
            field.setAccessible(true);//暴力反射
            System.out.println(field.get(persion));
        }


    }
}
