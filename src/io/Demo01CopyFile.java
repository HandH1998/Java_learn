package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\outputstream\\a.txt");
        FileOutputStream fos=new FileOutputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\inputstream\\a.txt");
        //一次读一个写一个
//        int len=0;
//        while((len=fis.read())!=-1){
//            fos.write(len);
//        }
        //使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }


        fos.close();
        fis.close();


    }
}
