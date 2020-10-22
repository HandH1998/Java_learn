package io.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream(new File("D:\\IDEA\\Projects\\Java_learn\\src\\io\\outputstream\\b.txt"));
        fos.write(49);
        fos.write(48);
        fos.write(48);

//        byte[] bytes={65,66,68,69};//ABCD
        byte[] bytes={-65,-66,-67,68,69};//
        fos.write(bytes);


        fos.write(bytes,3,2);//DE

        byte[] bytes1 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes1));//[-28, -67, -96, -27, -91, -67]
        fos.write(bytes1);

        fos.close();

    }
}
