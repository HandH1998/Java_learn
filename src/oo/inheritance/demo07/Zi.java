package oo.inheritance.demo07;

public class Zi extends Fu {
    public Zi(){
//        super();//在调用父类无参构造方法，不写也会赠送
        super(20);//调用父类的有参构造
        System.out.println("子类构造方法");
    }
    public void method(){
//        super();//错误写法！只有子类构造方法，才能调用父类构造方法
    }
}
