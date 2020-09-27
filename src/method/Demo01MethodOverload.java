package method;

public class Demo01MethodOverload {
    public static void main(String[] args) {
//        System.out.println(sumFour(3,4,4,6));
        System.out.println(sum(1, 3, 6));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    //错误写法！与参数的名称无关
//    public static int sum(int x, int y) {
//        return x + y;
//    }
    //错误写法！与方法的返回值类型无关。调用sum(3,5)但是不使用，这时不知道该调用哪一个方法
//    public static double sum(int a, int b) {
//        return a + b;
//    }
    //重载参数类型不同
    public static int sum(double a, double b) {
        return (int) (a + b);
    }
    //参数的多类型顺序不同
    public static int sum(int a,double b){
        return (int)(a+b);
    }
    public static int sum(double b,int a){
        return (int)(a+b);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
