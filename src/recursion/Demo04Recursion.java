package recursion;

import java.io.File;

public class Demo04Recursion {
    public static void main(String[] args) {
        File f=new File("D:\\IDEA\\Projects\\Java_learn\\src\\collection");
        getAllFile(f);
    }

    public static void getAllFile(File dir){
        if(dir.isDirectory()){
            File[] files=dir.listFiles();
            for (File f : files) {
                System.out.println(f);
                getAllFile(f);
            }
        }
    }
}
