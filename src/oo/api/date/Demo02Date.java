package oo.api.date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        dem01();
        demo02();
        demo03();
    }

    private static void demo03() {
        Date date=new Date();
        long time=date.getTime();
        System.out.println(time);
    }

    //Date类的带参数构造方法，Date(Long date),传递毫秒值，把毫秒值转换成Date日期
    private static void demo02() {
        Date date=new Date(0L);
        System.out.println(date);

        date=new Date(1602056932032L);
        System.out.println(date);
    }

    //Date类的空参构造方法，Date()获取当前系统的日期和时间
    private static void dem01() {
        Date date=new Date();
        System.out.println(date);
    }
}
