package cn.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable {


    @Override
    public void run() {
        int i = 10;
        ReentrantLock lock = new ReentrantLock();//手动锁
        while (i > 0) {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + i--);
        }
        lock.unlock();
    }
}
