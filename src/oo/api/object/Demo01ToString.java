package oo.api.object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {
    public static void main(String[] args) {
       /* Person类默认继承了Object类，
        可以使用Object类的toString方法*/
        Person p=new Person("张三",18);
        String s=p.toString();
        System.out.println(s);//oo.api.object.Person@1b6d3586

        //直接打印对象的名字，其实也是在调用对象的toString方法,打印地址值
        System.out.println(p);//oo.api.object.Person@1b6d3586

        //看一个类是否重写了toString,直接打印这个类的对象，如果没重写，那么打印的就是地址值
        Random r=new Random();
        System.out.println(r);//Random类没重写toString，打印的是地址值

        Scanner sc=new Scanner(System.in);
        System.out.println(sc);//Scanner类重写了toString

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        System.out.println(list);//Arraylist类重写了toString
    }
}
