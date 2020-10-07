package oo.api.calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    private static void demo04() {
        Calendar c=Calendar.getInstance();
        Date date=c.getTime();
        System.out.println(date);
    }

    private static void demo03() {
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        c.add(Calendar.YEAR,2);
        System.out.println(c.get(Calendar.YEAR));
    }

    private static void demo02() {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,999);
        System.out.println(c.get(Calendar.YEAR));

        c.set(3434,343,323);
    }

    private static void demo01() {
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        System.out.println(year);

        System.out.println(c.get(Calendar.MONTH+1));//西方的月份0-11

        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        System.out.println(c.get(Calendar.DATE));
    }

}
