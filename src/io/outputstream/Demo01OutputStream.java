package io.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos=new FileOutputStream("D:\\IDEA\\Projects\\Java_learn\\src\\io\\outputstream\\a.txt");
        //调用write方法
        fos.write(256);
        //释放资源
        fos.close();
    }
}
