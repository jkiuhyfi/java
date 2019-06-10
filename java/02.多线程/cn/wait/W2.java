package cn.wait;

public class W2 implements Runnable {

    private Object lock=new Object();

    @Override
    public void run() {
        synchronized (lock){
            try {

                lock.notify(); //等待
                System.out.println("notify 结束");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
