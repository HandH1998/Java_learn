package lambda.lambda_basic;

import java.util.ArrayList;

public class Demo06ArrayList {
    public static void main(String[] args) {
        //jdk1.7之前  前后的泛型都要写
        ArrayList<String> list01=new ArrayList<String>();

        //jdk1.7后  后面的泛型可以省略
        ArrayList<String> list02=new ArrayList<>();

    }
}
