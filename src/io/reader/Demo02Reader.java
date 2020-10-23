package io.reader;

import java.io.FileReader;
import java.io.IOException;

public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\IDEA\\Projects\\Java_learn\\src\\io\\reader\\a.txt");
//        int len=0;
//        while((len=fr.read())!=-1){
//            System.out.println(len);//20320 22909 49 50 51 97 98 99
////            System.out.println((char)len);//你好123abc
//        }

        //一次读取多个字符，放入字符数组
        char[] cs=new char[1024];
        int len=0;
        while((len=fr.read(cs))!=-1){
            System.out.println(len);
            System.out.println(new String(cs,0,len));
        }
        System.out.println(cs[1]);
        fr.close();
    }
}
