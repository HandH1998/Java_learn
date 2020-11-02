package stream;

import java.util.stream.Stream;

public class Demo09Stream_skip {
    public static void main(String[] args) {
        String[] arr={"美羊羊","喜羊羊","灰太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.skip(2);
        stream1.forEach(s-> System.out.println(s));
    }
}
