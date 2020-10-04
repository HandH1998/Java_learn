package oo.api.statickeywords;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj=new MyClass();//首先创建对象
        obj.method();//然后才能使用没有static关键字的内容

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称调用
        obj.methodStatic();//正确，但是不推荐，这种写法在编译后也会被javac编译成 类名称.静态方法名
        MyClass.methodStatic();//正确，推荐

        //对于本类当中的静态方法，可以省略类名称
        myMethod();
        Demo02StaticMethod.myMethod();//等效
    }
    public static void myMethod(){
        System.out.println("自己的方法！");
    }
}
