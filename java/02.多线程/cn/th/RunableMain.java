package cn.th;

//
public class RunableMain {

    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable, "窗口");
        thread.start();
        int j = 100;
        while (j <= 100 && j > 0) {
            String name = Thread.currentThread().getName();//获得当前线程的名字
            System.out.println(name + j);
            j--;
        }
    }
}
