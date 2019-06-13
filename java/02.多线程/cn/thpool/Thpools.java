package cn.thpool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thpools {

    public static void main(String[] args) {
        //创建多线程
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //执行任务
        Object ob = new Object();
        //等待
        pool.submit(new R1(ob));
        //唤醒
        pool.submit(new R3(ob));

    }
}
