package cn.wait;

public class WaitMain {

    public static void main(String[] args) {
        Thread th = new Thread(new W1());

        Thread thread = new Thread(new W2());
        th.start();
        thread.start();


    }
}
