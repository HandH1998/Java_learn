package oo;

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array={10,20,30,40};
        //面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                System.out.println(array[i]+"]");
            }else{
                System.out.print(array[i]+", ");
            }
        }
        System.out.println("=======");
        //找一个jdk给我们提供的Arrays类，其中的方法toString直接把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
