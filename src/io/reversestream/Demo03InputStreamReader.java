package io.reversestream;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo03InputStreamReader {
    public static void main(String[] args) throws IOException {
//        read_utf_8();
        read_gbk();
    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\reversestream\\gbk.txt"),"gbk");
        int len=0;
        while((len=isr.read())!=-1){
            System.out.println((char)(len));
        }
        isr.close();
    }

    //使用InputStreamReader读取utf-8文件
    private static void read_utf_8() throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\reversestream\\utf-8.txt"),"utf-8");
        int len=0;
        while((len=isr.read())!=-1){
            System.out.println((char)(len));
        }
        isr.close();
    }
}
