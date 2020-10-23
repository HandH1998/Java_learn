package io.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\IDEA\\Projects\\Java_learn\\src\\io\\writer\\a.txt");
        fw.write(97);
        fw.flush();
        fw.close();
    }
}
