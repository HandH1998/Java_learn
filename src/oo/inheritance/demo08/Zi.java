package oo.inheritance.demo08;

public class Zi extends Fu {
    int num=20;
    public Zi(){
        super();
    }

    public void methodZi(){
        System.out.println(super.num);
    }
    public void method(){
        super.method();
        System.out.println("子类方法");
    }
}
