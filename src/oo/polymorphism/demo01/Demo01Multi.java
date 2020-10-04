package oo.polymorphism.demo01;

public class Demo01Multi {
    public static void main(String[] args) {
        //多态的写法
        //左边父类的引用，指向了右侧子类的对象
        Fu obj=new Zi();
        obj.method();
        obj.methodFu();
    }
}
