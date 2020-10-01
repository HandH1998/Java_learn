package api.random;

import java.util.Random;
/*获取1~n随机数*/
public class Demo03Random {
    public static void main(String[] args) {
        Random r=new Random();

        int num=5;
        int result=r.nextInt(num)+1;
        System.out.println(result);
    }
}

