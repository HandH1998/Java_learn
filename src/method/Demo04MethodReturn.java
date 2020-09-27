package method;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num=getSum(10,10);
        System.out.println("返回值是："+num);

        printSum(19,39);
        //System.out.println(printSum(39,39));//错误写法！

    }
    public static int getSum(int a,int b){
        int result=a+b;
        return result;
    }
    public static void printSum(int a,int b){
        int result=a+b;
        System.out.println("结果是："+result);
    }
}
