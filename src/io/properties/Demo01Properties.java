package io.properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
//        show03();
//        show04();
        show05();
    }

    private static void show05() throws IOException {
        Properties prop=new Properties();
        prop.load(new FileInputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\properties\\a.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            System.out.println(s);
            System.out.println(prop.getProperty(s));
        }
    }

    private static void show04() throws IOException {
        Properties prop=new Properties();
        prop.load(new FileReader("D:\\IDEA\\Projects\\Java_learn\\src\\io\\properties\\a.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            System.out.println(s);
            System.out.println(prop.getProperty(s));
        }
    }

    private static void show03() throws IOException {
        Properties prop=new Properties();
        prop.setProperty("男","124");
        prop.setProperty("女","123");
        prop.setProperty("中","126");
        prop.store(new FileOutputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\properties\\b.txt"),"");

    }

    private static void show02() throws IOException {
        FileWriter fw=new FileWriter("D:\\IDEA\\Projects\\Java_learn\\src\\io\\properties\\a.txt");
        Properties prop=new Properties();
        prop.setProperty("男","124");
        prop.setProperty("女","123");
        prop.setProperty("中","126");

        prop.store(fw,"save data");
        fw.close();

    }

    private static void show01() {
        Properties prop=new Properties();
        prop.setProperty("男","124");
        prop.setProperty("女","123");
        prop.setProperty("中","126");

        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            System.out.println(s);
            System.out.println(prop.getProperty(s));
        }

    }
    
    
}
