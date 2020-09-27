package method;

public class Demo03MethodParam {

    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello.World!"+i);
        }
    }
    public static void main(String[] args) {
        method1(3,3);
        method2();
    }
    public static void method1(int a,int b){
        int result=a*b;
        System.out.println("结果数："+result);
    }
}
