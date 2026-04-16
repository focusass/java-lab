import java.util.*;

public class Task13 {

    static class Person {
        String name;
        int age;

        Person(String n, int a) {
            name = n;
            age = a;
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("A", 30),
                new Person("B", 20)
        );

        people.stream()
                .sorted(Comparator.comparing(p -> p.age))
                .forEach(p -> System.out.println(p.name));
    }
}