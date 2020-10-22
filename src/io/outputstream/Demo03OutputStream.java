package io.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos=new FileOutputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\outputstream\\c.txt",true);
        fos.write("你好".getBytes());
        fos.write("美女".getBytes());
        for (int i = 0; i < 10; i++) {
            fos.write("美女".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();


    }
}
