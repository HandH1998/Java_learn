package io.objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\objectstream\\person.txt"));
        Object o=ois.readObject();
        ois.close();
        System.out.println(o);
        System.out.println((Person)o);
    }
}
