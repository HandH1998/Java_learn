package oo.api.string;

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        char[] charArray={'H','e','l','l','o'};
        String str3=new String(charArray);

        System.out.println(str1.equals(str2));//true
        System.out.println(str2.equals(str3));//true
        System.out.println(str3.equals("Hello"));//true
        System.out.println("Hello".equals(str1));//true

        String str4="hello";
        System.out.println(str1.equals(str4));//false

        Person one=new Person(23,"er");
        //任何对象都能用Object进行接收
        System.out.println(str1.equals(one));
        System.out.println("========");
//
//        String str5=null;
//        System.out.println("abc".equals(str5));//推荐  false
//        System.out.println(str5.equals("abc"));//不推荐  报错，空指针异常NullPointerException

        System.out.println("=====");
        String strA="Java";
        String strB="java";
        System.out.println(strA.equals(strB));//false  严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));//true   忽略大小写
    }



}
