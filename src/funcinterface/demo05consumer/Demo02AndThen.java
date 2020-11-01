package funcinterface.demo05consumer;

import java.util.function.Consumer;

public class Demo02AndThen {
    //定义一个方法，方法的参数传递一个字符串和两个Consumer接口
    //Consumer接口的泛型使用字符串
    public static void method (String s , Consumer<String> con1, Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);
        con1.andThen(con2).accept(s);//先执行con1消费，再con2
    }

    public static void main(String[] args) {
        method("zy",
                (s1)->{
                    System.out.println(s1.toUpperCase());
                },
                (s2)->{
                    System.out.println(s2.toLowerCase());
                });
    }
}
