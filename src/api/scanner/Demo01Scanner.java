package api.scanner;

import java.util.Scanner;//导包

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//从键盘输入
        int num=sc.nextInt();//获取键盘输入的一个int数字
        System.out.println("输入的int数字："+num);
        String str=sc.next();//获取键盘输入的一个字符串
        System.out.println("输入的字符串："+str);
    }
}
