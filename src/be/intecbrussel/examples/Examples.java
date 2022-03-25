package be.intecbrussel.examples;

import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Examples {
    public static void main(String[] args) {
        String[] words = {"Hello", "this", "is", "an", "example", "of", "streams"};
        Stream.of(words)
                .forEach(System.out::println);
        // Stream<String> stream = Stream.of(words);
        //Consumer<String>consumer = System.out::println;
        //stream.forEach(consumer);


        //Stream<String> stream = Stream.generate(() -> "Hello World");

        IntStream iStream = IntStream.rangeClosed(0, 10);
        //iStream.forEach(System.out::println);

        IntStream.rangeClosed(11, 20);
        // .forEach(System.out::println);

        IntStream.iterate(0, i -> i + 1);
        //.forEach(System.out::println);

        String[] howdy = {"Howdy", "we", "come", "in", "peace"};
        Stream.of(howdy).forEach(System.out::println);

        IntStream.rangeClosed(0, 99);
        //.forEach(System.out::println);

        //using stream to reduce data
        //sum of int in range
        int sum = IntStream.rangeClosed(0, 10)
                .sum();
        System.out.println(sum);

        //max of int in range
        OptionalInt max = IntStream.rangeClosed(0, 10)
                .max();

        if (max.isPresent()) {
            System.out.println(max.getAsInt());
        } else {
            System.out.println("No result");
        }

        //stream without elements
        OptionalInt max1 = IntStream.of()
                .max();

        if(max1.isPresent()){
            System.out.println(max1.getAsInt());
        } else {
            System.out.println("No result");
        }

        //use of reduce method to create own reduction method
        int result = IntStream.rangeClosed(1,10)
                .reduce(1,(acc, el) -> acc*el);
        System.out.println(result);

        //use of BinarryOperator <T> to reduce other data types
        String res = Stream.of(words)
                .reduce("*", (acc, el) -> acc + el + "*");
        System.out.println(res);
    }
}



