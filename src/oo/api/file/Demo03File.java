package oo.api.file;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {

//        show01();
//        show02();
//        show03();
        show04();
    }

    private static void show04() {
        File f1=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file\\Demo01File.java");
        long l1 = f1.length();
        System.out.println(l1);//631 bytes

        File f2=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file\\a.txt");
        System.out.println(f2.length());//不存在的路径返回0

        File f3=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file");
        System.out.println(f3.length());//4096

        File f4=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\date");
        System.out.println(f4.length());//0

        File f6=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\arraylist");
        System.out.println(f6.length());
        File f5=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\a");
        System.out.println(f5.length());//0





    }

    private static void show03() {
        File f1=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);//a.txt

        File f2=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file");
        System.out.println(f2.getName());//file
    }

    private static void show02() {
        File f1=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file\\a.txt");
        File f2=new File("b.txt");
        String path1=f1.getPath();
        System.out.println(path1);//D:\IDEA\Projects\Java_learn\src\oo\api\file\a.txt
        String path2=f2.getPath();
        System.out.println(path2);//b.txt

        System.out.println(f1);//D:\IDEA\Projects\Java_learn\src\oo\api\file\a.txt
        System.out.println(f1.toString());//D:\IDEA\Projects\Java_learn\src\oo\api\file\a.txt
    }

    private static void show01() {
        File f1=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file\\a.txt");
        String absolutePath1=f1.getAbsolutePath();
        System.out.println(absolutePath1);//D:\IDEA\Projects\Java_learn\src\oo\api\file\a.txt

        File f2=new File("b.txt");
        String absolutePath2=f2.getAbsolutePath();
        System.out.println(absolutePath2);//D:\IDEA\Projects\Java_learn\b.txt

    }




}
