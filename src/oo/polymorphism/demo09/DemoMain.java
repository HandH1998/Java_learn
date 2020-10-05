package oo.polymorphism.demo09;

public class DemoMain {
    public static void main(String[] args) {
//        MyInterface obj=new MyInterfaceImpl();
//        obj.method();

//        MyInterface some=new MyInterface();//错误写法

        //使用匿名内部类  但不是匿名对象  对象名就是obj
        MyInterface obj=new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();

        //使用匿名内部类  也是匿名对象
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        }.method();

    }
}
