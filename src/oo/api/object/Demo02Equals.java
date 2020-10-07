package oo.api.object;

import java.util.ArrayList;

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1=new Person("迪丽热巴",12);
        Person p2=new Person("迪丽热巴",12);
        System.out.println(p1);
        System.out.println(p2);
        boolean b=p1.equals(p2);
        System.out.println(b);

//        p1=p2;
//        b=p1.equals(p2);
//        System.out.println(b);
        ArrayList<String> list=new ArrayList<>();
        System.out.println(p1.equals(list));

        System.out.println(p1.equals(null));

        System.out.println(p1.equals(p1));
    }
}
