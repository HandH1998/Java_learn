package funcinterface.stream;

import java.util.*;
import java.util.stream.Stream;

public class Demo03GerStream {
    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list=new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String> set=new HashSet<>();
        Stream<String> stream1 = set.stream();
        //map间接转换为Stream流
        Map<String,String> map=new HashMap<>();
        //获取键，存到一个Set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream2 = keySet.stream();
        //获取值，存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();

        //获取键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        //数组转换为Stream流
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4);
        //可变参数可以传递数组
        Integer[] arr={1,2,3,4,5};
        Stream<Integer> stream6 = Stream.of(arr);

        String[] arr2={"ab","bc"};
        Stream<String> stream7 = Stream.of(arr2);


    }
}
