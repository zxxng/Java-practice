package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
    // 배열의 stream 생성
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream();
        intStream.forEach(System.out::print);

        // stream은 1회용.
        intStream = list.stream();
        intStream.forEach(System.out::print);

        // 배열 stream 생성
        String[] strArr = new String[] {"a","b","c","d"};
        Stream<String> strStream = Stream.of(strArr);
        // Stream<String> strStream = Stream.of(new String[] {"a","b","c","d"});
        strStream.forEach(System.out::print);

        Stream<String> strStream2 = Stream.of("a","b","c");
        strStream2.forEach(System.out::print);

        int[] intArr = {1,2,3,4,5};
        IntStream intStream1 = Arrays.stream(intArr);
        intStream1.forEach(System.out::println);
//        System.out.println("count: " + intStream1.count());
//        System.out.println("sum: " + intStream1.sum());
        System.out.println("average: " + intStream1.average());

        Integer[] intArr2 = {1,2,3,4,5};
        Stream<Integer> intStream2 = Arrays.stream(intArr2);
//        integerStream.forEach(System.out::println);
        System.out.println("count: "+intStream2.count());
//        System.out.println("sum: " + intStream1.sum()); // 객체 스트림이라 sum, average 활용 불가
//
//        숫자 스트림을 다룰때에는 기본형을 쓰면 부가적인 메소드(?) 활용 가능!!
    }
}
