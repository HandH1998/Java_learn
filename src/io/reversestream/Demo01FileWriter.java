package io.reversestream;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Demo01FileWriter {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\IDEA\\Projects\\Java_learn\\src\\io\\reversestream\\我是GBK格式文件.txt");
        int len=0;
        while((len=fr.read())!=-1){
            System.out.println((char)(len));
        }
        fr.close();
    }
}
