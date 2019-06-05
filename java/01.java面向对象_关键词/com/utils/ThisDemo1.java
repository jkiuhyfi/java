package com.utils;

import java.util.HashMap;
import java.util.Map;

// this 表示当前对象
public class ThisDemo1 {

    Map<String,Object> map=new HashMap<>();

    public  void set(){
        this.map.put("thiss","当前对象");
    }

    public Object get(){
        return  this.map.get("thiss");
    }
    public static void main(String[] args) {

    }

}
