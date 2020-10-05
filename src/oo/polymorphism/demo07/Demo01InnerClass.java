package oo.polymorphism.demo07;

public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body=new Body();//外部类的对象
        //通过外部类的对象，调用外部类的方法，里边间接再使用内部类Heart
        body.methodBody();
        System.out.println("=======");

        //直接使用内部类
//        Body.Heart heart=new Body().new Heart();//正确
        Body.Heart heart=body.new Heart();//正确
        heart.beat();
    }
}
