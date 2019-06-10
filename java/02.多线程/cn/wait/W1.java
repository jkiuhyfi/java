package cn.wait;

public class W1 implements Runnable {


    protected Object lock=new Object();

    @Override
    public void run() {
        synchronized (lock){

            try {
                System.out.println("wait 开始");
               lock.wait(); //等待
                System.out.println("wait 结束");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
