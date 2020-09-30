package oo.encapsulation;

public class Demo03Person {
    public static void main(String[] args) {
        Person person =new Person();
        person.show();
        person.name="赵丽颖";
//        person.age=23;直接访问private成员变量出错
        person.setAge(-20);
        person.show();
    }
}
