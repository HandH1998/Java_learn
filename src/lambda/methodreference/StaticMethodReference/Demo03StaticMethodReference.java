package lambda.methodreference.StaticMethodReference;

public class Demo03StaticMethodReference {
    //定义一个方法，方法的参数传递要计算的绝对值的整数和函数式接口Calcable
    public static int method(int number, Calcable c){
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        int number = method(-10, n -> Math.abs(n));
        System.out.println(number);

        //使用方法引用
        //Math类是存在的
        //abs计算绝对值的静态方法也是存在的
        //可以通过类名调用静态方法
        int number2 = method(-10, Math::abs);
        System.out.println(number2);
    }
}
