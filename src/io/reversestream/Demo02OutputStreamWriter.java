package io.reversestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
//        write_utf_8();
        write_gbk();
    }

    private static void write_gbk() throws IOException {
        //创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\reversestream\\gbk.txt"),"gbk");
//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\reversestream\\utf-8.txt"));//不指定默认使用utf-8
        //使用write方法写入内存缓冲区
        osw.write("你好");
        //flush方法刷新
        osw.flush();
        //释放资源
        osw.close();
    }

    //使用转换流OutputStreamWriter写UTF-8文件
    private static void write_utf_8() throws IOException {
        //创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\reversestream\\utf-8.txt"),"utf-8");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\reversestream\\utf-8.txt"));//不指定默认使用utf-8
        //使用write方法写入内存缓冲区
        osw.write("你好");
        //flush方法刷新
        osw.flush();
        //释放资源
        osw.close();
    }
}
