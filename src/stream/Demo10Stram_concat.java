package stream;

import java.util.stream.Stream;

public class Demo10Stram_concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("zhangsanfeng", "zhangcuishan", "zhaomin");
        String[] arr={"美羊羊","喜羊羊","灰太狼"};
        Stream<String> stream1 = Stream.of(arr);
        Stream<String> stream2 = Stream.concat(stream, stream1);
        stream2.forEach(s-> System.out.println(s));
    }
}
