package oo.encapsulation.demo01;

public class Student {
    //成员变量
    private String name;
    private int age;
    //无参构造方法
    public Student(){
        System.out.println("无参构造方法执行了！");
    }
    //有参构造方法
    public Student(String name,int age){
        System.out.println("有参构造方法执行了！");
        this.name=name;
        this.age=age;
    }
    //方法
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
