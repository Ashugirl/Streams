package be.intecbrussel.examples;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class MathyExercise {
    public static void main(String[] args) {

        double intStream = IntStream.rangeClosed(0, 1000)
                .filter(num -> (num % 5 == 0) && (num % 8 == 0))
                .limit(20)
                .mapToDouble(Math::sqrt)
                .sum();
        System.out.println(intStream);


        Random stream = new Random();
        stream.ints(0,1000)
                .filter(num -> (num % 2 == 0))
                .distinct()
                .limit(500)
                .forEach(System.out::println);
    }
}





