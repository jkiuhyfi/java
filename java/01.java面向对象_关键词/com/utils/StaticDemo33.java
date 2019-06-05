package com.utils;

public class StaticDemo33 {

    // static 1.修饰变量
    //        2.修饰方法  类名引用
    //        3.静态代码块(加载一次)
    private static String addre;
    static {
        addre="sss";
        System.out.println("只加载一次"+addre);
    }

    public static void main(String[] args) {
       StaticDemo3.add();
    }
}
