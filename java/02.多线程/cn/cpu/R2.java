package cn.cpu;

public class R2 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
              //  Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("线程二"+Thread.currentThread().getName()+i);
        }
    }
}
