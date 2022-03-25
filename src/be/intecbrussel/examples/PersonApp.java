package be.intecbrussel.examples;

import java.util.stream.Stream;

public class PersonApp {
    public static void main(String[] args) {

        Person person1 = new Person("Fred", "Flintstone", Person.Gender.MALE, 35, 83, 1.78f);
        Person person2 = new Person("Wilma", "Flintstone", Person.Gender.FEMALE, 33, 63, 1.80f);
        Person person3 = new Person("Barney", "Rubble", Person.Gender.MALE, 32, 75, 1.60f);
        Person person4 = new Person("Betty", "Rubble", Person.Gender.FEMALE, 32, 67, 1.78f);
        Person[] people = {person1, person2, person3, person4};
        Stream.of(people).forEach(System.out::println);
    }
}
