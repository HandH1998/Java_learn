package exception;

import java.util.Scanner;

public class Demo11RegisterException {
    private static String[] usernames={"张三","李四","王五"};

    public static void main(String[] args) /*throws RegisterException */{
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String username=sc.next();
        checkUsername(username);
    }

    public static void checkUsername(String username) /*throws RegisterException*/ {
        for (String s : usernames) {
            if(s.equals(username)){

                throw new RegisterException("该用户已经被注册了");

            }
        }
        System.out.println("恭喜注册成功！");
    }

}
