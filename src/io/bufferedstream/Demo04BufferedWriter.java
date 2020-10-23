package io.bufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo04BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\IDEA\\Projects\\Java_learn\\src\\io\\bufferedstream\\c.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("小张");
            bw.newLine();//换行
        }
        bw.close();

    }
}
