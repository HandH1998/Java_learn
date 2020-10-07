package oo.api.object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
//        String s1="abd";
        String s1=null;
        String s2="aBd";
//        System.out.println(s1.equals(s2));//NullPointerException  null是不能调用方法的


//        Objects类的方法equals方法：对两个对象比较，可以放在空指针异常
        System.out.println(Objects.equals(s1,s2));


    }
}
