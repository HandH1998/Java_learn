package stream;

import java.util.stream.Stream;

public class Demo04Stream_forEach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "田六");

        //使用Stream流中的方法forEach
        stream.forEach(name-> System.out.println(name));
    }
}
