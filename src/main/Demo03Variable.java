package main;

/*
对于float和long型，字母后缀F和L不能省
 */
public class Demo03Variable {
    public static void main(String[] args) {
        //int num;//需要进行赋值
        //System.out.println(num);
        {
            int num2 = 53;
            System.out.println(num2);
        }
        //System.out.println(num2);//num2作用在上个大括号里，此时超过了作用域
        int num2 = 34;//可以重新定义num2
        System.out.println(num2);
        //一次定义多个变量之后赋值
        int a, b, c;
        a=1;
        b=2;
        c=3;
        //一次定义多个变量并同时赋值
        int x=1,y=2,z=3;
    }
}
