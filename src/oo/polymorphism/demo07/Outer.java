package oo.polymorphism.demo07;

public class Outer {
    int num=10;//外部类的成员变量
    public class Inner {
        int num=20;//内部类的成员变量

        public void methodInner(){
            int num=30;//内部类方法的局部变量
            System.out.println(num);//30
            System.out.println(this.num);//20
//            System.out.println(super.num);//错误，不是继承
            System.out.println(Outer.this.num);//10
        }
    }
}
