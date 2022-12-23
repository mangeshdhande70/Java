package Stream;

import java.util.stream.Stream;

public class StreamOf {

    public static void main(String[] args) {

        Stream s = Stream.of(9,99,999,9999,99999);
        s.forEach(System.out::println);


        System.out.println();

        Double[] d = {9.5,9.0,9.6,9.0,4.6,6.0};

        Stream s1 = Stream.of(d);

        s1.forEach(System.out::println);



    }
}
