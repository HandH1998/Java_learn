package io.reversestream;

import java.io.*;

public class Demo04Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\reversestream\\test_gbk.txt"),"gbk");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\reversestream\\test_utf-8.txt"),"utf-8");
        int len=0;
        while((len=isr.read())!=-1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
