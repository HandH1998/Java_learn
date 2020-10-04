package oo.api.arraylist;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student one=new Student("洪七公",23);
        Student two=new Student("欧阳锋",22);
        Student three=new Student("黄药师",22);
        Student four=new Student("段智兴",25);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"+"+list.get(i).getAge());
        }
    }
}
