package com.utils;

import java.util.HashMap;
import java.util.Map;

public class Person2 {

    private String name;

    private Integer age;

    private Map map = new HashMap();

    public Person2() {

    }

    public Person2(String name, Integer age) {
        this();//引用无惨的构造方法
        this.name = name;  //区分成员变量与局部变量
        this.age = age;
        this.map.put("当前对象", name);//当前对象
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {

        this.age = age;
    }
}
