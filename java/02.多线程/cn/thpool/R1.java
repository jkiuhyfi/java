package cn.thpool;

public class R1 implements Runnable {
    private Object ob;

    public R1(Object ob) {
        this.ob = ob;
    }

    @Override
    public void run() {
        synchronized (ob) {

            try {
                System.out.println("等待前");
                ob.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("等待后");
        }
    }
}
