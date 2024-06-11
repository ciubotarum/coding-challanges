package theory.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 23),
                new Person("Bob", 17),
                new Person("Charlie", 19),
                new Person("David", 38),
                new Person("Eve", 59)
        );

        // Filter out persons younger than 18 years.
        // Extract the names of the remaining persons.
        // Sort the names alphabetically.
        // Collect the names into a list.
        List<String> filteredNames = people.stream()
                .filter(person -> person.getAge() <= 18)
                .map(Person::getName)
                .sorted()
                .collect(Collectors.toList());
//        System.out.println(filteredNames);


        // Filter out persons older than 30.
        // Extract their names.
        // Convert the names to uppercase.
        // Sort the names in descending order.
        // Print each name.
        people.stream()
                .filter(person -> person.getAge() >= 30)
                .map(Person::getName)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
