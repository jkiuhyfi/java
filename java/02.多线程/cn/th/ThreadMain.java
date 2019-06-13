package cn.th;

public class ThreadMain {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        int j = 100;
        while (j <= 100 && j > 0) {
            System.out.println("线程二" + j);
            j--;
        }
    }
}
