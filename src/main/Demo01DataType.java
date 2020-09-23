package main;

public class Demo01DataType {
    public static void main(String[] args){
        System.out.println(1234);//默认int
        System.out.println(2.34);//默认double
        //左边是long，右边是默认的int，不一样会数据类型转换
        //int-->long  范围从小到大，自动转换
        long num1=100;
        System.out.println(num1);

        //float-->double  范围从小到大，自动转换
        double num2=2.5F;
        System.out.println(num2);

        //long-->float  范围从小到大，自动转换
        float num3=43L;
        System.out.println(num3);

    }
}
