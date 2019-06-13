package cn.waitdemo;

public class WaitDemo2 {

    public static void main(String[] args) {
        //保证锁对象唯一
        // 同步锁   wait()等待   nitify()唤醒
        Object ob = new Object();

        //消费者
        new Thread() {
            @Override
            public void run() {

                synchronized (ob) {

                    try {
                        System.out.println("等待前");
                        ob.wait(5000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("等待后");
                }
            }
        }.start();

        //消费者
        new Thread() {
            @Override
            public void run() {

                synchronized (ob) {

                    try {
                        System.out.println("等待前2");
                        ob.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("等待后2");
                }
            }
        }.start();


        //生产者
        new Thread() {
            @Override
            public void run() {

                try {
                    Thread.sleep(2000);

                    synchronized (ob) {
                        System.out.println("唤醒前");
                        ob.notifyAll();
                        //   System.out.println("唤醒后");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }.start();
    }
}
