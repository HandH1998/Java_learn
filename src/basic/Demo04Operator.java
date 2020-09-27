package basic;

public class Demo04Operator {
    public static void main(String[] args){
        int a=20;
        int b=30;
        System.out.println(a-b);

        //变量和常量可以混合使用
        System.out.println(a*10);

        int x=10;
        int y=3;
        System.out.println(x/y);//整除，只能得到商
        System.out.println(x%y);//取模

        //int+double-->double+double-->double
        double result3=x+2.5;
        System.out.println(result3);
    }
}
