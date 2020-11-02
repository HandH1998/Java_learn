package stream;

import java.util.stream.Stream;

public class Demo08Stream_limit {
    public static void main(String[] args) {
        String[] arr={"美羊羊","喜羊羊","灰太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.limit(2);
        stream1.forEach(s-> System.out.println(s));
    }

}
