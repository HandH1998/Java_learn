package basic.recursion;

import java.io.File;

public class Demo05Recursion {
    public static void main(String[] args) {
        File f=new File("D:\\IDEA\\Projects\\Java_learn\\src\\collection");
        getAllFile(f);
    }

    public static void getAllFile(File dir){
        if(dir.isDirectory()){
            File[] files=dir.listFiles();
            for (File f : files) {
                if(f.isFile()&&f.getName().toLowerCase().endsWith(".java")){
                    System.out.println(f);
                }
//                System.out.println(f);
                getAllFile(f);
            }
        }
    }
}
