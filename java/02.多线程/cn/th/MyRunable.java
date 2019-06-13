package cn.th;

//实现 Runnable接口，重写 run方法 ，start启动，与继承不同的是通过 new Thread
public class MyRunable implements Runnable {
    @Override
    public void run() {
        int i = 100;
        while (i <= 100 && i > 0) {
            System.out.println("多线程一" + i);
            i--;
        }
    }
}
