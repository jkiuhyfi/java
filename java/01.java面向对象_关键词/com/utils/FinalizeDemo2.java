package com.utils;
//finalize  检测对象何时被释放
public class FinalizeDemo2 {

    public void  finalize(){  //固定的写法
        System.out.println("垃圾回收");
    }
    public static void main(String[] args) {
        FinalizeDemo2 finalizeDemo21 = new FinalizeDemo2();
        FinalizeDemo2 finalizeDemo22 = new FinalizeDemo2();
        finalizeDemo21 =null;
        finalizeDemo22 =null;
        System.gc();//垃圾回收
        for(int i=0;i<10000;i++){
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
