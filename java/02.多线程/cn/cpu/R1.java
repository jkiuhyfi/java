package cn.cpu;

public class R1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                //   Thread.sleep(2000); //休眠  会阻塞改线程
                //     Thread.yield();//线程让步 不会阻塞改线程
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("线程一" + Thread.currentThread().getName() + i);
        }
    }
}
