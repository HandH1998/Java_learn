package io.printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出的");
        PrintStream ps=new PrintStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\printstream\\print1.txt");
        System.setOut(ps);//把输出语句的目的地改变为打印流的目的地
        System.out.println("我在打印流的目的地输出");
        ps.close();
    }
}
