package oo.inheritance.demo09;

public class Zi extends Fu {
    int num=20;
    public Zi(){
//        super();//这一行不再赠送
        this(24);//本类的无参构造，调用本类的有参构造
//        this(2,3)//错误！
    }
    public Zi(int n){

    }
    public Zi(int n,int m){

    }
    public void showNum(){
        int num=10;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类中的成员变量
        System.out.println(super.num);//父类中的成员变量
    }

    public void methodA(){
        System.out.println("AAA");
    }
    public void methodB(){
        this.methodA();
        System.out.println("BBB");
    }
}
