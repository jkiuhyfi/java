package cn.file.递归;

public class DiGuiDemo1 {

    public static void main(String[] args) {
       //求  n+(n-1)+...+3+2+1的和
        int s=sum(3);
        System.out.println(s);
        //求n!的阶乘
        // 5!=5*(5-1)*(5-2)*(5-3)*(5-4)

        int n= s(5);
        System.out.println(n);
    }

    private static int s(int i) {
        if(i==1){
            return 1;
        }
        return i*s(i-1);
    }

    private static int sum(int i) {
        //结束条件
        if(i==1){
            return 1;
        }
        return i+sum(i-1);
    }


}
