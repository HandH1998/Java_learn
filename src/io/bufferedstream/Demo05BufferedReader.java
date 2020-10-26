package io.bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo05BufferedReader {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\IDEA\\Projects\\Java_learn\\src\\io\\bufferedstream\\c.txt"));
        
    }
}
