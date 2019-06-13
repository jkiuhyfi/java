package 反射;

import java.lang.reflect.Method;

public class methodsdemo {

    public static void main(String[] args) throws Exception {

        //class对象
        Class<Persion> cs = Persion.class;
        //
        Method eat = cs.getMethod("eat");
        Persion persion = new Persion();
        System.out.println(eat.invoke(persion));

        Method eat2 = cs.getMethod("eat2", String.class);
        //获得方法名
        String name = eat2.getName();
        System.out.println(name);
        //获得类名
        String name1 = cs.getName();
        System.out.println("类名是" + name1);

        Object invoke = eat2.invoke(persion, "方法");
        System.out.println(invoke);


    }
}
