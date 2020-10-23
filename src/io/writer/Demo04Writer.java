package io.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\IDEA\\Projects\\Java_learn\\src\\io\\writer\\d.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("HelloWorld"+"\r\n");
        }
        fw.close();
    }
}
