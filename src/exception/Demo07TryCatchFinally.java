package exception;

import java.io.IOException;

public class Demo07TryCatchFinally {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.ttxt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //无论是否异常都会执行
            System.out.println("资源释放");
        }

        System.out.println("后续程序");
    }

    public static void readFile(String filename) throws IOException {

        if(!filename.endsWith(".txt")){
            throw new IOException("文件后缀名不对");
        }
        System.out.println("读取文件");
    }
}
