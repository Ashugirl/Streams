package be.intecbrussel.examples;

import java.util.*;
import java.util.stream.Stream;

public class Reduction {
    public static void main(String[] args) {

        int[] nums = {2, 5};

        long count1 = Arrays.stream(nums).count();
            System.out.println("Number of items in array: " +count1);

        OptionalInt max = Arrays.stream(nums).max();
        System.out.println("Highest number in array: " +max);

        OptionalInt min = Arrays.stream(nums).min();
        System.out.println("Lowest number in array: " + min);

        OptionalDouble avg = Arrays.stream(nums).average();
        System.out.println("Average of the numbers in array: " + avg);

        int sum = Arrays.stream(nums).sum();
        System.out.println("The sum of the numbers in array: " + sum);

        int reduce = Arrays.stream(nums)
                        .reduce(0,(acc, el) -> acc+ (el*el));
        System.out.println(reduce);

        String[] text = {"This","is","an","array","of","strings"};
        String res = Stream.of(text)
                .reduce(";",(acc,el) -> acc + el + ";");
        System.out.println(res);




    }
}
