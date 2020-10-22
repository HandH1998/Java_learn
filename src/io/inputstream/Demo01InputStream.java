package io.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        //创建FileInputStream对象
        FileInputStream fis=new FileInputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\outputstream\\a.txt");
        //使用read方法读取文件
//        int len=fis.read();
//        System.out.println(len);
//
//        int len1=fis.read();
//        System.out.println(len1);
//        int len2=fis.read();
//        System.out.println(len2);
//        int len3=fis.read();
//        System.out.println(len3);//-1 读取完毕

        int len=0;
        while((len=fis.read())!=-1){
            System.out.println((char)(len));
        }
//        while(fis.read()!=-1){
//            System.out.println(fis.read());
//        }//这么写会出问题，read读完后会移动指针
        //释放资源
        fis.close();

    }
}
