package oo.api.stringbuilder;

public class Demo01StringBuilder {
    public static void main(String[] args) {
        //空参构造方法
        StringBuilder bu1=new StringBuilder();
        System.out.println(bu1);//""空字符串
        //带参构造方法
        StringBuilder bu2=new StringBuilder("dsd");
        System.out.println(bu2);//dsd
    }
}
