package oo.iterfacelearn.demo01;

public class Demo01Interface {
    public static void main(String[] args) {
        //错误写法，不能直接使用接口创建对象
//        MyInterfaceAbstract inter=new MyInterfaceAbstract();
        //创建实现类的对象使用
        MyInterfaceAbstractImpl impl=new MyInterfaceAbstractImpl();
        impl.methodAbs1();
    }

}
