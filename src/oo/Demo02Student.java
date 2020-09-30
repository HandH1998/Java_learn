package oo;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu=new Student();
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.name="www";
        stu.age=23;
        System.out.println(stu.name);
        System.out.println(stu.age);

//        System.out.println(stu.eat());eat()没有返回值，不能打印
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
