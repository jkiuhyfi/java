package cn.th;
//多线程  通过继承实现
public class MyThread extends Thread {

    @Override
    public void run() {
       int i=100;
        while (i<=100 && i>0){
            System.out.println("多线程一"+i);
            i--;
        }

    }
}
