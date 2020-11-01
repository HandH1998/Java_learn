package funcinterface.demo06predicate;

import java.util.function.Predicate;

public class Demo03Predicate_or {
    //定义一个方法，方法的参数传递一个字符串，
    //传递两个Predicate接口
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
//        return pre1.test(s)||pre2.test(s);
        return pre1.or(pre2).test(s);//等价于return pre1.test(s)||pre2.test(s);
    }

    public static void main(String[] args) {
        String s="advde";
        boolean b = checkString(s,
                (str)->{
                    return str.length()>5;
                },(str)->{
                    return str.contains("a");
                });
        System.out.println(b);
    }
}
