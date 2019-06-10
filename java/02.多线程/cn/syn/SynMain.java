package cn.syn;

public class SynMain {

    public static void main(String[] args) {
        Thread thread = new Thread(new SynThread(), "线程一");

        Thread thread2 = new Thread(new SynThread(), "线程二");
        thread.start();
        thread2.start();


    }
}
