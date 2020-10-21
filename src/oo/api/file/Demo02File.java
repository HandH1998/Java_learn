package oo.api.file;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
//        show01();
//        show02("c:\\","c.txt");
        show03();
    }

    private static void show01(){
        File f1=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file\\a.txt");
        System.out.println(f1);//重写了toString方法D:\IDEA\Projects\Java_learn\src\oo\api\file\a.txt

        File f2=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file");
        System.out.println(f2);//重写了toString方法D:\IDEA\Projects\Java_learn\src\oo\api\file

        File f3=new File("b.txt");
        System.out.println(f3);//b.txt  相对路径
    }

    private static void show02(String parent,String child){
        File file=new File(parent,child);
        System.out.println(file);//c:\c.txt
    }

    private static void show03(){
        File parent=new File("c:\\");
        File file=new File(parent,"hello.java");
        System.out.println(file);//c:\hello.java
    }
}
