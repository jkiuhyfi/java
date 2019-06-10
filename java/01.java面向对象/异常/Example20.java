package 异常;
// throwable（顶级接口） error：错误 靠程序本身不能修复  exception 异常 靠程序本身能修复
public class Example20 {
    public static void main(String[] args) {
        int divice = divice(4, 0);
        System.out.println(divice);
    }

    private static int divice(int i, int j) {

        try {
          int  r = i/j;
          return r;
        } catch (Exception e) {
           return Integer.parseInt(e.getMessage());
        }finally {
            System.out.println("总时");
        }

    }


}
