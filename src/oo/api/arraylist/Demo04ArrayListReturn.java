package oo.api.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100)+1);
        }
        System.out.println(getSmallList(list));

    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> smallList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                smallList.add(list.get(i));
            }
        }
        return smallList;
    }

}
