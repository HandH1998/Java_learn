package main;

public class Demo09Logic {
    public static void main(String[] args){
        System.out.println(true&&false);
        System.out.println(3<4&&10>5);

        int a=10;
        //短路效应，a不会改变
        System.out.println(3>4&&++a<100);//false
        System.out.println(a);//10
    }
}
