package io.ioexception;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01TryCatch {
    public static void main(String[] args) {
        //提高变量fw的作用域
        //变量在定义的时候可以没有值，但是使用的时候必须有值
        FileWriter fw=null;
        try{
            fw=new FileWriter("W:\\IDEA\\Projects\\Java_learn\\src\\io\\writer\\d.txt",true);

            for (int i = 0; i < 10; i++) {
                fw.write("HelloWorld"+"\r\n");
            }
        }catch (IOException e){
            System.out.println(e);
        }finally {
            if(fw!=null){
                try {//close方法也声明了异常，需要处理这个异常对象，要么throws，要么try catch
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
