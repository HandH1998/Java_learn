package oo.api.file;

import java.io.File;

public class Demo01Filter {
    public static void main(String[] args) {
        File f=new File("D:\\IDEA\\Projects\\Java_learn\\src\\collection");
        getAllFile(f);
    }

    public static void getAllFile(File dir){
        if(dir.isDirectory()){
            File[] files=dir.listFiles(new FileFilterImpl());
            for (File f : files) {
                System.out.println(f);
                getAllFile(f);
            }
        }
    }
}
