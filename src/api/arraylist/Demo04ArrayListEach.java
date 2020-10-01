package api.arraylist;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("zhang");
        list.add("li");
        list.add("sun");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
