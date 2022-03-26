package be.intecbrussel.examples;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static be.intecbrussel.examples.Person.Gender.FEMALE;

public class PersonApp {
    public static void main(String[] args) {

        Person person1 = new Person("Fred", "Flintstone", Person.Gender.MALE, 35, 83, 1.78f);
        Person person2 = new Person("Wilma", "Flintstone", FEMALE, 33, 63, 1.80f);
        Person person3 = new Person("Barney", "Rubble", Person.Gender.MALE, 32, 75, 1.60f);
        Person person4 = new Person("Betty", "Rubble", FEMALE, 32, 67, 1.78f);
        Person[] people = {person1, person2, person3, person4};
        System.out.println("Printing each item in the array: ");
        Stream.of(people).forEach(System.out::println);
        System.out.println();

        System.out.println("Printing stream as Array: ");
        Person[] persons = Stream.of(people)
                .toArray(size -> new Person[size]);
        System.out.println(Arrays.toString(persons));
        System.out.println();

        System.out.println("Printing all with gender = female: ");
        Stream.of(people)
                .filter(person -> person.getGender() == FEMALE)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Printing all older than 32: ");
        Stream.of(people)
                .filter(person -> person.getAge() > 32)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Printing all people with weights between 65 and 80:");
        Stream.of(people)
                .filter(person -> person.getWeight() > 65)
                .filter(person -> person.getWeight() < 80)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Printing people with weight about 75 and aged above 34: ");
        Stream.of(people)
                .filter(person -> person.getWeight() > 75)
                .filter(person -> person.getAge() > 34)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Printing all ages: ");
        Stream.of(people)
                .map(person -> person.getAge())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Printing first and last names:");
        Stream.of(people)
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Printing average, minimum and maximum ages: ");
        OptionalDouble average = IntStream.of(person1.getAge(), person2.getAge(), person3.getAge(), person4.getAge())
                .average();
        OptionalInt max = IntStream.of(person1.getAge(), person2.getAge(), person3.getAge(), person4.getAge())
                .max();
        OptionalInt min = IntStream.of(person1.getAge(), person2.getAge(), person3.getAge(), person4.getAge())
                .min();
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println();

        System.out.println("Printing all weights: ");
        Stream.of(people)
                .map(person -> person.getWeight())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Printing average, minimum and maximum weights: ");
        OptionalDouble avWeight = DoubleStream.of(person1.getWeight(), person2.getWeight(), person3.getWeight(), person4.getWeight())
                .average();
        OptionalDouble maxWeight = DoubleStream.of(person1.getWeight(), person2.getWeight(), person3.getWeight(), person4.getWeight())
                .max();
        OptionalDouble minWeight = DoubleStream.of(person1.getWeight(), person2.getWeight(), person3.getWeight(), person4.getWeight())
                .min();
        System.out.println("Average: " + avWeight);
        System.out.println("Maximum: " + maxWeight);
        System.out.println("Minimum: " + minWeight);


    }
}
