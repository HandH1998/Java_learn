package oo.polymorphism.demo07;

public class Demo02InnerClass {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer().new Inner();
        obj.methodInner();
        System.out.println(obj.num);//20
    }
}
