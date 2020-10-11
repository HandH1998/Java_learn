package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo06TryCatch {
    public static void main(String[] args) {
        try{
            readFile("d:\\a.tx");
        }catch(IOException e){
            System.out.println("文件后缀不对");
            System.out.println(e.getMessage());//文件后缀名不对
            System.out.println(e.toString());//java.io.IOException: 文件后缀名不对
            System.out.println(e);//java.io.IOException: 文件后缀名不对
            e.printStackTrace();//jvm默认调用
        }
        System.out.println("后续代码");
    }
    public static void readFile(String filename) throws IOException{

        if(!filename.endsWith(".txt")){
            throw new IOException("文件后缀名不对");
        }
        System.out.println("读取文件");
    }
}
