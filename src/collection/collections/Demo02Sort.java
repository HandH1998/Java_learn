package collection.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        Collections.addAll(list01,1,2,3,6,5);
        System.out.println(list01);//[1, 2, 3, 6, 5]

        //public static <T> void sort(List<T> list)
        Collections.sort(list01);
        System.out.println(list01);//[1, 2, 3, 5, 6]

        ArrayList<String> list02=new ArrayList<>();
        Collections.addAll(list02,"a","c","b");
        System.out.println(list02);//[a, c, b]

        //public static <T> void sort(List<T> list)
        Collections.sort(list02);
        System.out.println(list02);//[a, b, c]

        ArrayList<Person> list03=new ArrayList<>();
        list03.add(new Person("张三",15));
        list03.add(new Person("李四",13));
        list03.add(new Person("王五",17));
        System.out.println(list03);


        Collections.sort(list03);
        System.out.println(list03);


    }
}
