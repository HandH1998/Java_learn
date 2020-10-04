package oo.polymorphism.demo02;

public class Demo01MultiField {
    public static void main(String[] args) {
        //多态写法
        Fu obj=new Zi();
        System.out.println(obj.num);
        //错误写法
//        System.out.println(obj.age);
        System.out.println("=======");
        //子类没有覆盖重写，就是父：10
        //子类覆盖重写，就是子:20

        obj.showNum();

    }


}
