package oo.inheritance.demo02;

public class Zi extends Fu {
    int numZi=20;
    int num=200;
    public void methodZi(){
        //因为本类中有num用本类
        System.out.println(num);
    }
}
