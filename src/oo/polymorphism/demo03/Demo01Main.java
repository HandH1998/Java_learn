package oo.polymorphism.demo03;

public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型就是多态
        Animal animal=new Cat();//本来是创建的猫
        animal.eat();
//        animal.catchMouse();//错误写法

        //向下转型，进行还原动作
        Cat cat=(Cat) animal;
        cat.catchMouse();//还原成功了

        //下面是错误的向下转型
        //本来是猫，现在非得做条狗
        Dog dog=(Dog) animal;//错误写法  编译不会报错，运行会出现异常ClassCastException
    }
}
