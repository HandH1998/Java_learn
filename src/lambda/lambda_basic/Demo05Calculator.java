package lambda.lambda_basic;

public class Demo05Calculator {
    public static void main(String[] args) {
        invokeCalc(1, 2, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        //使用lambda表达式
        invokeCalc(2,3,(int a,int b)->{
            return a+b;
        });
    }
    public static void invokeCalc(int a,int b,Calculator c){
        int sum=c.calc(a,b);
        System.out.println(sum);
    }
}
