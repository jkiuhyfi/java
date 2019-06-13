package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class constrotsdemo {

    public static void main(String[] args) throws Exception {

        //获得 class对象
        Class<Persion> aClass = Persion.class;
        //获得构造方法
        Constructor<Persion> constructor = aClass.getConstructor(String.class, int.class);
        //创建对象
        Persion persion = constructor.newInstance("好", 11);
        System.out.println(persion);
        System.out.println("-----------------------");

        //空参
        Persion persion1 = aClass.newInstance();
        System.out.println(persion1);

    }
}
