package oo.api.file;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    private static void show03() {
        File f1=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\ss");
        System.out.println(f1.delete());//true

    }

    private static void show02() {
        File f1=new File("src\\oo\\api\\file\\sss");
        boolean b1=f1.mkdir();
        System.out.println(b1);//true

        File f2=new File("src\\oo\\api\\file\\sss\\bbb\\aa");
        System.out.println(f2.mkdir());//false mkdir 只能创建单级文件夹
        System.out.println(f2.mkdirs());//true mkdirs  可以创建多级文件夹  也可创建单级文件夹

        File f3=new File("src\\oo\\api\\file\\c.txt");
        System.out.println(f3.mkdirs());//这是创建一个名为c.txt的文件夹

        File f4=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\fil\\dd");
        System.out.println(f4.mkdir());//false  路径不存在  不会创建文件夹
    }

    private static void show01() throws IOException {
        File f1=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\file\\a.txt");
        boolean b1= false;
        try {
            b1 = f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(b1);

        File f2=new File("src\\oo\\api\\file\\b.txt");
        boolean b2=f2.createNewFile();
        System.out.println(b2);

        File f3=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\ss");
        boolean b3=f3.createNewFile();
        System.out.println(b3);//这时创建的是ss文件

        File f4=new File("D:\\IDEA\\Projects\\Java_learn\\src\\oo\\api\\ile\\c.txt");
        boolean b4=f4.createNewFile();
        System.out.println(b4);//由于路径不存在会抛出异常IOException

    }
}
