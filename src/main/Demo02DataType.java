package main;

import com.sun.deploy.util.SyncAccess;

public class Demo02DataType {
    public static void main(String[] args) {
        //左边是int，右边是long
        //long-->int，不是从小到大，不能自动转换
        int num = (int) 100L;
        System.out.println(num);

        //int num1=6000000000;//6000000000超过了int范围报错
        //long-->int
        int num1 = (int) 6000000000L;
        System.out.println(num1);//1705032704，数据溢出

        //double-->float
        int num3=(int)3.5;
        System.out.println(num3);//3，精度损失，并不是四舍五入，所有的小数位都会被舍去

        char zifu1='A';
        System.out.println(zifu1+2);//67，大写字母A被当成65进行处理
        //一旦char类型进行数学运算，字符会按一定的规则翻译成一个数字

        byte num4=40;
        byte num5=50;
        //byte+byte-->int+int-->int
        //byte result1=num4+num5;//两个byte会先被提升为int，故结果右边是int，int转换为byte会有精度损失
        int result1=num4+num5;
        System.out.println(result1);

        short num6=60;
        //byte+short-->int+int-->int
        //int强制转换为short：注意必须保证逻辑上真是大小本来就没有超过short范围，否则会数据溢出
        short result2=(short)(num4+num6);
        System.out.println(result2);
        //boolean s=true;
        //System.out.println(s+1);//boolean类型不能发生强制类型转换
    }
}
