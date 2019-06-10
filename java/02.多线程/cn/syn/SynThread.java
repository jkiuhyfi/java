package cn.syn;
//同步方法  同步代码块
public class SynThread implements Runnable{


    @Override
    public void run() {
        int i=10;
        sum(i);
    }

    private synchronized void sum(int i) {
        while (i>0) {
            System.out.println(Thread.currentThread().getName()+i--);
        }
    }
}
