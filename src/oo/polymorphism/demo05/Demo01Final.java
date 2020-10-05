package oo.polymorphism.demo05;

public class Demo01Final {
    public static void main(String[] args) {
        int num1=10;
        System.out.println(num1);
        num1=20;
        System.out.println(num1);
        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改
        //一次赋值，终生不变
        final int num2=2000;
        System.out.println(num2);

//        num2=250;//错误写法
        //正确写法，只要保证有唯一一次赋值即可
        final int num3;
        num3=30;

        //对于基本类型，不可变说的是变量中的数据不可改变
        //对于引用类型，不可变说的是变量当中的地址值不可改变,但是指向的对象内容可以改变
        Student stu1=new Student("赵丽颖");
        System.out.println(stu1.getName());
        System.out.println(stu1);
        stu1=new Student("霍建华");
        System.out.println(stu1.getName());
        System.out.println(stu1);
        System.out.println("======");
        final Student stu2=new Student("高圆圆");
        //错误写法
//        stu2=new Student("赵又廷");
        stu2.setName("高圆圆的儿子");
        System.out.println(stu2.getName());

    }
}

