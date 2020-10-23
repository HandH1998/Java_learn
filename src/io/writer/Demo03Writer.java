package io.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\IDEA\\Projects\\Java_learn\\src\\io\\writer\\f.txt");
        char[] cs={'a','b','c','你','好'};
        fw.write(cs);//abc你好

        fw.write(cs,1,4);//bc你好

        fw.write("传智播客");//传智播客

        fw.write("黑马程序员",2,3);
        fw.close();


    }

}
