package api.arraylist;

import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA=new ArrayList<>();
        //错误写法！泛型只能是引用类型，不能是基本类型
//        ArrayList<int> listB=new ArrayList<>();

        ArrayList<Integer> listC=new ArrayList<>();
        listC.add(344);
        listC.add(343);
        System.out.println(listC);

        int num=listC.get(1);//用int类型接受
        System.out.println(num);
    }
}
