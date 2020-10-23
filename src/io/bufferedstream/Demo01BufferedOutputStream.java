package io.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\bufferedstream\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("传多个数据到内部缓冲区".getBytes());
        bos.close();
    }
}
