package cn.syn;

public class SaleMain {

    public static void main(String[] args) {
        Thread thread = new Thread(new SaleThread(),"线程一");

        Thread thread3 = new Thread(new SaleThread(),"线程二");

        thread.start();
        thread3.start();
    }
}
