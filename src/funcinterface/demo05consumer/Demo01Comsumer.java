package funcinterface.demo05consumer;

import java.util.function.Consumer;

public class Demo01Comsumer {
    //定义一个方法，方法的参数传递一个字符串名称，
    //方法的参数传递Consumer接口，泛型使用String
    //可以使用Consumer接口消费
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        method("zzy",(String mingzi)->{
            //消费方式一  直接输出
            System.out.println(mingzi);
            //消费方式二  反转输出
            String reName=new StringBuilder(mingzi).reverse().toString();
            System.out.println(reName);
        });//注意lambda表达式里的参数名字可以任意指定，调用的时候会明确


    }
}
