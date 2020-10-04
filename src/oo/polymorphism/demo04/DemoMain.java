package oo.polymorphism.demo04;

public class DemoMain {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer=new Computer();
        computer.powerOn();
        //准备一个鼠标，供电脑使用
        Mouse mouse=new Mouse();
        //向上转型为USB
        USB usbMouse=mouse;
        //参数是USB类型，我正好传进去USB类型
        computer.useDevice(usbMouse);
        System.out.println("=======");

        //准备一个键盘
        KeyBoard keyBoard=new KeyBoard();
        //方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyBoard);//正确  也发生了向上转型
//        computer.useDevice(new KeyBoard());//正确

        computer.powerOff();

        System.out.println("=======");

        //下面以自动类型转换解释为什么可以  方法参数是USB类型，传递进去的是实现类对象
        method(10.0);//正确  double-->double
        method(20);//正确  int-->double
        int a=30;
        method(a);//正确  int-->double

    }
    public static void method(double num){
        System.out.println(num);
    }
}
