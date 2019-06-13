package 时间;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat format = new SimpleDateFormat("今年是yyyy-mm-dd");
        //将date转成 SimpleDateFormat格式
        String format1 = format.format(date);
        System.out.println(format1);
    }
}
