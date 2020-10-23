package io.bufferedstream;

import java.io.*;

public class Demo03CopyFile {
    public static void main(String[] args) throws IOException {
        long a=System.currentTimeMillis();
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\bufferedstream\\a.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\bufferedstream\\b.txt"));
        int len=0;
        while((len=bis.read())!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();
        long b=System.currentTimeMillis();
        System.out.println("耗时"+(b-a)+"毫秒");
    }
}
