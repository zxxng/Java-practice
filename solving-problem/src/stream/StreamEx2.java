package stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {
    // 무한 스트림의 생성
    public static void main(String[] args) {
//        IntStream intStream = new Random().ints(); // 무한 스트림
//        IntStream intStream = new Random().ints(5); // 개수 지정
        IntStream intStream = new Random().ints(5, 10); // 범위 지정
        intStream
                .limit(10)
                .forEach(System.out::println);

        // iterate(T seed, UnaryOperator f) : 단항 연산자
        Stream<Integer> intStream2 = Stream.iterate(1, n -> n + 2);
        intStream2.limit(10).forEach(System.out::println);

        // generate(Supplier s) : 주기만 하는 것 입력x, 출력 o
        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(10).forEach(System.out::println);
    }
}
