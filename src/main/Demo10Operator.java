package main;

public class Demo10Operator {
    public static void main(String[] args){
        int a=10;
        int b=20;

        int max;
        max=a>b?a:b;
        System.out.println(max);

        //int result=3>4?2.5:10;//2.5不符合int，编译器会报错
        System.out.println(a>b?a:b);
    }
}
