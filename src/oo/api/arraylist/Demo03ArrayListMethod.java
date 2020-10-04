package oo.api.arraylist;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);//[]
        //add
        boolean success=list.add("柳岩");
        System.out.println(list);//[柳岩]
        System.out.println(success);
        list.add("高圆圆");
        list.add("赵又廷");
        System.out.println(list);

        //get
        System.out.println(list.get(2));

        //remove
        System.out.println(list.remove(2));
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println("长度："+size);
    }
}
