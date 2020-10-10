package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("d","d");
        map.put("c","c");
        System.out.println(map);//key不允许重复，无序

        LinkedHashMap<String,String> linked=new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("b","b");
        linked.put("d","d");
        linked.put("c","c");
        System.out.println(linked);//有序

    }
}
