package io.ioexception;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02JDK07 {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("D:\\IDEA\\Projects\\Java_learn\\src\\io\\writer\\d.txt",true);){
            for (int i = 0; i < 10; i++) {
                fw.write("HelloWorld"+"\r\n");
            }
        }catch (IOException e){
            System.out.println(e);
        }


    }
}
