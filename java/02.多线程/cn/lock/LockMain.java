package cn.lock;

public class LockMain {

    public static void main(String[] args) {
        Thread thread = new Thread(new LockThread(), "线程一");
        Thread thread2 = new Thread(new LockThread(), "线程二");
        thread.start();
        thread2.start();

    }
}
