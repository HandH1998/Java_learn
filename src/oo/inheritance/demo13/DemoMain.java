package oo.inheritance.demo13;

public class DemoMain {
    public static void main(String[] args) {
        //    Animal animal=new Animal();//错误，这是抽象类
//    Dog dog=new Dog();//错误，这也是抽象类
        Dog2Ha ha=new Dog2Ha();//正确
        ha.eat();
        ha.sleep();
        System.out.println("====");

        DogGolden  golden=new DogGolden();
        golden.eat();
        golden.sleep();
    }

}
