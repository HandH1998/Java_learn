package oo.polymorphism.demo02;

public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj=new Zi();
        obj.method();//父子都有，优先用子
        obj.methodFu();//子类没有，父类有，向上找父类
//        obj.methodZi();

    }
}
