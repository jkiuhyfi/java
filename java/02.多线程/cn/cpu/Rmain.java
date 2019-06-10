package cn.cpu;

public class Rmain {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R1());

        Thread thread2 = new Thread(new R2());
        thread1.start();
        thread2.start();

        thread2.join(); //插入

        //线程的优先级
//        thread1.setPriority(10);
//        thread2.setPriority(2);


    }
}
