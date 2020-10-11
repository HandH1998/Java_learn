package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05Throws {
//    public static void main(String[] args) throws FileNotFoundException,IOException{
//    public static void main(String[] args) throws IOException{
    public static void main(String[] args) throws Exception{
        readFile("d:\\a.txt");
    }

    //FileNotFoundException extends IOException
    //当然声明Exception肯定没错，都是它的子类

//    public static void readFile(String filename) throws FileNotFoundException,IOException{
//    public static void readFile(String filename) throws IOException{
    public static void readFile(String filename) throws Exception{
        if(!filename.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不对");
        }

        if(!filename.endsWith(".txt")){
            throw new IOException("文件后缀名不对");
        }
        System.out.println("读取文件");
    }
}
