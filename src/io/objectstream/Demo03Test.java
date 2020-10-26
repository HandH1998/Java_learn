package io.objectstream;

import java.io.*;
import java.util.ArrayList;

public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",14));
        list.add(new Person("王五",17));

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:" +
                "\\IDEA\\Projects\\Java_learn\\src\\io\\objectstream\\list.txt"));
        oos.writeObject(list);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\" +
                "IDEA\\Projects\\Java_learn\\src\\io\\objectstream\\list.txt"));
        Object o=ois.readObject();
        //强转成ArrayList<Person>
        ArrayList<Person> list1=(ArrayList<Person>)o;
        for (Person person : list1) {
            System.out.println(person);
        }

    }
}
