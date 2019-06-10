package cn.syn;

public class SaleThread implements Runnable {

    Object lock=new Object();
    @Override
    public void run() {
        int i=10;
        while (i>0) {
            //多个线程共享同一个资源，每次操作只允许一个线程访问
            synchronized (lock) {
                try {

                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "---" + i-- + "张");
            }
        }

    }
}
