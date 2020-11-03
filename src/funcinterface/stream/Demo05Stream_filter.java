package funcinterface.stream;

import java.util.stream.Stream;

public class Demo05Stream_filter {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream = Stream.of("zhangsanfeng", "zhangcuishan", "zhaomin");
        //对Stream流中的元素进行过滤
        Stream<String> stream1 = stream.filter(name -> name.startsWith("zhang"));
        stream1.forEach(name-> System.out.println(name));

//        funcinterface.stream.forEach(name-> System.out.println(name));Stream流只能消费一次
    }
}
