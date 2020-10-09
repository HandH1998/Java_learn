package collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        //public static <T> boolean addAll(Collection<T> c,T... elements)
        Collections.addAll(list,"a","b","c");
        System.out.println(list);
        Collections.addAll(set,"s","d","e");
        System.out.println(set);

        //public static void shuffle(List<?> list)
        Collections.shuffle(list);
        System.out.println(list);


    }


}
