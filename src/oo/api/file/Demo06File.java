package oo.api.file;

import java.io.File;

public class Demo06File {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        File file=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file");
        File[] arr=file.listFiles();
        for (File s : arr) {
            System.out.println(s);
        }
    }

    private static void show01() {
        File file=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file");
        String[] arr=file.list();
        for (String s : arr) {
            System.out.println(s);
        }

//        File file1=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file\\a.txt");
//        String[] arr1=file1.list();//NullPointerException  文件不能遍历
//        for (String s : arr1) {
//            System.out.println(s);
//        }

        File file2=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\fil");
        String[] arr2=file2.list();//NullPointerException  路径不存在
        for (String s : arr2) {
            System.out.println(s);
        }


    }
}
