package oo.api.random;

import java.util.Random;
import java.util.Scanner;

/*代码模拟猜数字游戏*/
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r=new Random();
        int randomNum=r.nextInt(100)+1;//[1,100]
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("请输入你猜测的数字：");
            int guessNum=sc.nextInt();
            if(guessNum>randomNum){
                System.out.println("大了");
            }else if(guessNum<randomNum){
                System.out.println("小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}
