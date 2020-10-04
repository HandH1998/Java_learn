package oo.iterfacelearn.demo01;

public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl=new MyInterfaceStaticImpl();
        //错误写法！
//        impl.methodStatic();
        //直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
