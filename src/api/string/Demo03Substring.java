package api.string;

public class Demo03Substring {
    public static void main(String[] args) {
        String str1="HelloWorld";
        String str2=str1.substring(5);
        System.out.println(str1);//HelloWorld
        System.out.println(str2);//World  产生的是一个新字符串对象

        System.out.println("=======");
        String str3=str1.substring(4,7);
        System.out.println(str3);//oWo

        //下面的这种写法，字符串的内容也是没有改变的
        //下面有两个字符串，"Hello"  "World"
        //strA中的是地址值
        String strA="Hello";
        System.out.println(strA);
        strA="Java";
        System.out.println(strA);
    }
}
