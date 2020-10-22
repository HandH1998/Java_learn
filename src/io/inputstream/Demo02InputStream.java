package io.inputstream;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\outputstream\\a.txt");
//        byte[] bytes=new byte[2];
//        int len=fis.read(bytes);
//        System.out.println(len);//2
////        System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(bytes));//AB
//
//        len=fis.read(bytes);
//        System.out.println(len);//2
//        System.out.println(new String(bytes));//CD
//
//        len=fis.read(bytes);
//        System.out.println(len);//1
//        System.out.println(new String(bytes));//ED
//
//        len=fis.read(bytes);
//        System.out.println(len);//-1  没有读到数据
//        System.out.println(new String(bytes));//ED

        byte[] bytes=new byte[1024];
        int len=0;
        while((len=fis.read(bytes))!=-1){
            System.out.println(len);
            System.out.println(new String(bytes,0,6));
        }
        fis.close();
    }
    }
