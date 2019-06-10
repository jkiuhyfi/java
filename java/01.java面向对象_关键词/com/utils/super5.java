package com.utils;
// super访问父类的变量 方法
public class super5 extends super55 {

    public super5(String name) {
        super(name); //调用父类的构造方法
    }

    @Override
    public void shout() {
        super.shout();//调用父类的方法

        System.out.println(super.name);//访问父类的变量
    }



    public static void main(String[] args) {
        super5 super5 = new super5("name");
        super5.shout();
    }
}
