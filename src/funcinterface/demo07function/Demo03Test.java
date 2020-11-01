package funcinterface.demo07function;

import java.util.function.Function;

public class Demo03Test {
    public static void change(String s, Function<String,String> fun1,
                              Function<String,Integer> fun2, Function<Integer,Integer> fun3){
        Integer i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);

    }

    public static void main(String[] args) {
        String s="zzz,23";
        change(s,(str)->{
            return str.split(",")[1];
        },(str)->{
            return Integer.parseInt(str);
        },(str)->{
            return str+10;
        });

    }
}
