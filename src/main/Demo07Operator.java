package main;

public class Demo07Operator {
    public static void main(String[] args){
        int a=10;
        a+=5;
        System.out.println(a);//15

        int x=10;
        x%=3;
        System.out.println(x);//1

        byte num=30;
        //num=byte+int
        //num=int+int
        //num=int
        //num=(byte)int 强制类型转换
        num +=5;
        System.out.println(num);

    }
}
