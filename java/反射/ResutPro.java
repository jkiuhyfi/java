package 反射;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ResutPro {

    public static void main(String[] args) throws Exception {

        //加载配置文件
        Properties pro = new Properties();
        InputStream in = ResutPro.class.getClassLoader().getResourceAsStream("pro.properties");
        pro.load(in);
        //获得配置文件的数据
//        String property = pro.getProperty("className");
//        String eat = pro.getProperty("methodName");
//        //反射
//        Class<?> aClass = Class.forName(property);
//        //创建对象
//        Object instance = aClass.newInstance();
//        //获得方法
//        Method method = aClass.getMethod(eat);
//        method.invoke(instance);

    }
}
