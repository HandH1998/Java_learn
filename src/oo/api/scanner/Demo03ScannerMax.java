package oo.api.scanner;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个的数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个的数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个的数字：");
        int c = sc.nextInt();

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值："+max);
    }
}
