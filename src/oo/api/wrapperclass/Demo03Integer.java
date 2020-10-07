package oo.api.wrapperclass;

public class Demo03Integer {
    public static void main(String[] args) {
        //基本类型转换为字符串
        int i1=100;
        String s1=i1+"";
        System.out.println(s1+200);//100200

        String s2 = Integer.toString(100);
        System.out.println(s2+200);//100200

        String s3=String.valueOf(100);
        System.out.println(s3+200);//100200

        //字符串转换为基本数据类型
        int i=Integer.parseInt(s1);
        System.out.println(i-10);//90

//        Integer.parseInt("a");//NumberFormatException
    }
}
