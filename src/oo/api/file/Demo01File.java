package oo.api.file;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        String pathSeparator= File.pathSeparator;
        System.out.println(pathSeparator);//路径分割符 windows:分号;   linux:冒号 :

        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparatorChar);

        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符 windows:反斜杠\   linux:正斜杠/

        char separatorChar = File.separatorChar;
        System.out.println(separatorChar);


    }
}
