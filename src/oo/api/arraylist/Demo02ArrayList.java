package oo.api.arraylist;

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);

        list.add("赵丽颖");
        System.out.println(list);
        list.add("jjj");
//        list.add(100);错误写法，创建的时候是String
        System.out.println(list);
    }
}
