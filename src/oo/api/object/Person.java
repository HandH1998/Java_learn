package oo.api.object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //直接打印对象的地址值没有意义，需要重写Object类中的toString方法

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }


//    @Override
//    public boolean equals(Object o) {
//        //增加一个判断，传递的o如果是this本身，直接返回true提高效率
//        if(this==o) return true;
//        //增加一个判断是否是null提高效率
//        if(o==null) return false;
//        //增加一个判断防止 ClassCastException
//        if(o instanceof Person){
//            //先向下转型
//            Person person = (Person) o;
//            return age == person.age &&
//                    this.name.equals(person.name);
//        }else{//不是Person类型
//            return false;
//        }
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass()  使用反射技术判断o是否是Person类型，等效于o instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
