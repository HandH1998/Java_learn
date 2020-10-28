package io.printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\printstream\\print.txt");
        ps.write(97);//a
        ps.println(97);//97
        ps.println(44.4);
        ps.println(true);
        ps.println("Hello,world!");
        ps.close();
    }
}

