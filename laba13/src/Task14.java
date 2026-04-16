import java.util.*;

public class Task14 {

    static class Student {
        String name;
        int age;
        double grade;

        Student(String n, int a, double g) {
            name = n;
            age = a;
            grade = g;
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ali", 20, 90),
                new Student("Dana", 19, 70),
                new Student("Max", 21, 85)
        );

        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(s -> System.out.println(s.name));
    }
}