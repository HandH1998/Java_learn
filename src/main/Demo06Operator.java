package main;

public class Demo06Operator {
    public static void main(String[] args){
        int num1=10;
        System.out.println(num1);
        ++num1;
        System.out.println(num1);
        num1++;
        System.out.println(num1);

        System.out.println("=========");
        int num2=20;
        System.out.println(++num2);//21
        System.out.println(num2);//21

        int num3=30;
        System.out.println(num3++);//30
        System.out.println(num3);//31
        System.out.println("=========");

        int num4=40;
        int result1=--num4;
        System.out.println(result1);//39
        System.out.println(num4);//39
        System.out.println("=========");

        int num5=50;
        int result2=num5--;
        System.out.println(result2);//50
        System.out.println(num5);//49
        System.out.println("=========");

        int x=10;
        int y=20;
        //11+20=31
        int result3=++x+y--;//不建议使用
        System.out.println(result3);//31
        System.out.println(x);//11
        System.out.println(y);//19
    }
}
