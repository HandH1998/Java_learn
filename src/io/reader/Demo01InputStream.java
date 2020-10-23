package io.reader;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\reader\\a.txt");
        int len=0;
        while((len=fis.read())!=-1){
            System.out.println(len);
        }
        fis.close();
    }
}
