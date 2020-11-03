package lambda.methodreference.ObjectMethodReference;

public class Demo01Printable {
    //定义一个方法，参数传递Printable接口
    public static void printString(Printable p){
        p.print("Hello,world!");
    }

    public static void main(String[] args) {
        //调用printString方法，方法的参数Printable是一个函数式接口，所以可以传递lambda表达式
        printString(s-> System.out.println(s));
        printString(System.out::println);//::
    }
}
