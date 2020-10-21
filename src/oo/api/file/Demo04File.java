package oo.api.file;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        File f1=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\ss");
        if(f1.exists()){
            System.out.println(f1.isDirectory());//false
            System.out.println(f1.isFile());//false
        }

        File f2=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file");
        if(f2.exists()){
            System.out.println(f2.isFile());//false
            System.out.println(f2.isDirectory());//true
        }

    }

    private static void show01() {
        File f1=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file");
        System.out.println(f1.exists());//true

        File f2=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\ss");
        System.out.println(f2.exists());//false

        File f3=new File("api");
        System.out.println(f3.exists());//false

    }
}
