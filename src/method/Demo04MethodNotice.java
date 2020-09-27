package method;

public class Demo04MethodNotice {
    public static void main(String[] args) {

    }

    public static int method1() {
        return 10;
    }

    public static void method2() {
//      return 10;//错误！方法没有返回值，return后面就不能写返回值。
        return;
    }

    public static void method3() {
        System.out.println("AAA");
        System.out.println("BBB");
//        return;最后一行的返回值可以省略不写
    }
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
}
