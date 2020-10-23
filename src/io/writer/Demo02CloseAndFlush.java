package io.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02CloseAndFlush {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\IDEA\\Projects\\Java_learn\\src\\io\\writer\\a.txt");
        fw.write(97);
        fw.flush();
        //刷新之后流可以继续使用
        fw.write(98);
        fw.flush();
        fw.close();
        //close之后流不能再使用了
    }
}
