package main;

public class Demo13Noice {
    public static void main(String[] args){
        short num1=10;

        short a=5;
        short b=8;
        //short+short-->int+int-->int
        //short result=a+b;//错误写法，需要强制类型转换

        //右边全是常量，编译器常量优化
        short result=5+8;
        System.out.println(result);

        //右侧不全是常量，没有编译器优化
        //short result=5+a;错误写法
    }
}
