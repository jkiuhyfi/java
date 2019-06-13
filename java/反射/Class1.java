package 反射;

public class Class1 {

    public static void main(String[] args) throws ClassNotFoundException {
        //获得  class对象的三种方式
        Class<?> aClass = Class.forName("Persion");
        System.out.println(aClass);

        Class<Persion> persionClass = Persion.class;
        System.out.println(persionClass);

        Persion persion = new Persion();
        Class<? extends Persion> aClass1 = persion.getClass();
        System.out.println(aClass1);
    }

}
