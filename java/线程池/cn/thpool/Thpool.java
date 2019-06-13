package cn.thpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//线程池
public class Thpool {

    public static void main(String[] args) {
        //创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);
        //执行线程的任务
        Object ob = new Object();

        pool.submit(new RunableImpl2(ob));
        pool.submit(new RunableImpl());
    }

}
