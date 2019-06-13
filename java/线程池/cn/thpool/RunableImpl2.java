package cn.thpool;

public class RunableImpl2 implements Runnable {
    private Object ob;

    public Object getOb() {
        return ob;
    }

    public void setOb(Object ob) {
        this.ob = ob;
    }

    public RunableImpl2(Object ob) {
        this.ob = ob;
    }

    @Override
    public void run() {
        System.out.println(ob);
    }
}
