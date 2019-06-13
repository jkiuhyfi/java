package cn.newinstan;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Nmain {

    public static void main(String[] args) throws Exception {

        //加载配置文件
        Properties pro=new Properties();
        InputStream in = Nmain.class.getClassLoader().getResourceAsStream("pro.properties");
        pro.load(in);

        //获得参数
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //反射
        Class<?> aClass = Class.forName(className);
        Method method = aClass.getMethod(methodName);
        //获得对象
        Object o = aClass.newInstance();
        //执行方法
        method.invoke(o);


    }
}
