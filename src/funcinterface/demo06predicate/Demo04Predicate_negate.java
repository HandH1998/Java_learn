package funcinterface.demo06predicate;

import java.util.function.Predicate;

public class Demo04Predicate_negate {
    //定义一个方法，方法的参数传递一个字符串，
    //传递两个Predicate接口
    public static boolean checkString(String s, Predicate<String> pre1){
//        return !pre1.test(s);
        return pre1.negate().test(s);//等价于return !pre1.test(s);
    }

    public static void main(String[] args) {
        String s="advde";
        boolean b = checkString(s,
                (str)->{
                    return str.length()>5;
                });
        System.out.println(b);
    }
}
