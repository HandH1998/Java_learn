package funcinterface.stream;

import java.util.stream.Stream;

public class Demo06Stream_map {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        Stream<Integer> integerStream = stringStream.map(s -> Integer.parseInt(s));
        integerStream.forEach(in-> System.out.println(in));
    }
}

