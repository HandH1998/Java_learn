package io.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\objectstream\\person.txt"));
        oos.writeObject(new Person("小美女",18));
        oos.close();
    }
}
