package oo.api.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo02Filter {
    public static void main(String[] args) {
        File f=new File("D:\\IDEA\\Projects\\Java_learn\\src\\collection");
        getAllFile(f);
    }

    public static void getAllFile(File dir){
        if(dir.isDirectory()){
//            File[] files=dir.listFiles(new FileFilter() {
//                @Override
//                public boolean accept(File pathname) {
//                    if(pathname.isDirectory()) return true;
//                    return pathname.getName().toLowerCase().endsWith(".java");
//                }
//            });
            //使用lambda表达式
            File[] files=dir.listFiles((d)->d.isDirectory()||d.getName().toLowerCase().endsWith(".java"));


//            File[] files=dir.listFiles(new FilenameFilter() {
//                @Override
//                public boolean accept(File dir, String name) {
//                    return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
//                }
//            });

            //使用lambda表达式
//            File[] files=dir.listFiles((d,name)->new File(d,name).isDirectory()||name.toLowerCase().endsWith(".java"));

            for (File f : files) {
                System.out.println(f);
                getAllFile(f);
            }
        }
    }
}
