package funcinterface.demo07function;

import java.util.function.Function;

public class Demo01Function {
    public static void change(String s, Function<String, Integer> fun){
        Integer in=fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s="123";
        change(s,(str)->{
            return Integer.parseInt(str);
        });
        //优化lambda
        change(s,(str)->Integer.parseInt(str));
    }
}
