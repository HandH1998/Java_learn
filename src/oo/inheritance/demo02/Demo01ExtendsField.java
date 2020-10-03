package oo.inheritance.demo02;

public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu=new Fu();
        System.out.println(fu.numFu);
        System.out.println("======");

        Zi zi=new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("======");

        //等号左边是谁，就优先用谁
        System.out.println(zi.num);//200
//        System.out.println(zi.abs);//到处都没有，编译报错

        //这个方法是子类的，优先使用子类的，没有再向上找
        zi.methodZi();//200
        //这个方法是在父类当中定义的，用父类中的num
        zi.methodFu();//100
    }
}
