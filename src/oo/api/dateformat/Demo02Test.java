package oo.api.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        //获取出生日期
        Scanner sc=new Scanner(System.in);
        System.out.println("输入出生日期：");
        String s=sc.next();
        //parse解析输入的日期为Date格式日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        //转换成毫秒
        Long time1=sdf.parse(s).getTime();
        //当前日期转换成毫秒
        Date date=new Date();
        Long time2=date.getTime();
        //计算
        System.out.println((time2-time1)/1000/60/60/24);
    }
}
