package oo.api.wrapperclass;

import oo.polymorphism.demo07.Outer;

public class Demo01Integer {
    public static void main(String[] args) {
        //装箱
        //构造方法
        Integer in1=new Integer(1);
        System.out.println(in1);//重写了toString方法
        Integer in2=new Integer("23");
        System.out.println(in2);

        //静态方法
        Integer in3=Integer.valueOf(1);
        System.out.println(in3);
        Integer in4=Integer.valueOf("34");
//        Integer in5=Integer.valueOf("a");//NumberFormatException
        System.out.println(in4);

        //拆箱
        int i=in1.intValue();
        System.out.println(i);
    }
}
