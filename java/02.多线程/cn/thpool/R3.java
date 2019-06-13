package cn.thpool;

public class R3 implements Runnable {

    private Object ob;

    public R3(Object ob) {
        this.ob = ob;
    }

    @Override
    public void run() {
        synchronized (ob) {
            System.out.println("唤醒前");
            try {
                Thread.sleep(2000);
                ob.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
