package oo.api.random;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r=new Random();
        System.out.println(r);//地址
        int num=r.nextInt();
        System.out.println("随机数："+num);
    }
}
