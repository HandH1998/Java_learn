package funcinterface.demo06predicate;

import java.util.function.Predicate;

public class Demo01Predicate {
    //定义一个方法
    //参数传递一个String类型的字符串
    //传递一个Predicate接口，泛型使用String
    //使用test方法
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s="abcded";
        boolean b = checkString(s, (String s1) -> {
            return s1.length()>5;
        });
        System.out.println(b);

        //优化lambda表达式
        b = checkString(s, (s1) -> s1.length()>5);
        System.out.println(b);
    }
}
