package oo.encapsulation.demo01;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1=new Student();
        Student stu2=new Student("wowo",34);
        System.out.println("姓名："+stu2.getName()+",年龄："+stu2.getAge());
    }
}
