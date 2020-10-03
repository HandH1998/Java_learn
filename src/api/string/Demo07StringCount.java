package api.string;

import java.util.Scanner;

public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input=sc.next();
        char[] charArray=input.toCharArray();
        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;

        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
            if('A'<=ch&&ch<='Z'){
                countUpper++;
            }else if('a'<=ch&&ch<='z'){
                countLower++;
            }else if('0'<=ch&&ch<='9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字母有："+countUpper);
        System.out.println("小写字母有："+countLower);
        System.out.println("数字有："+countNumber);
        System.out.println("其他有："+countOther);
    }
}