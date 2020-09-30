package oo.encapsulation.demo02;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setAge(34);
        stu1.setName("didi");
        System.out.println("姓名："+stu1.getName()+",年龄："+stu1.getAge());
        System.out.println("=====");

        Student stu2=new Student("gugu",23);
        System.out.println("姓名："+stu2.getName()+",年龄："+stu2.getAge());

    }
}
