public class Main {

    // ===== Задача 1. Переменные и константы =====
    static void task1() {
        int age = 18;
        double height = 180;
        boolean isStudent = true;

        final String COUNTRY = "Казахстан";

        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Является студентом: " + isStudent);
        System.out.println("Страна (константа): " + COUNTRY);
        System.out.println();
    }

    // ===== Задача 2. Примитивные и ссылочные типы =====
    static void task2() {
        int number = 10;
        String name = "Наташа";

        System.out.println("Примитивный тип int: " + number);
        System.out.println("Ссылочный тип String: " + name);
        System.out.println();
    }

    // ===== Задача 3. Область видимости =====
    static void task3() {
        ScopeExample example = new ScopeExample();
        example.showValues();
        System.out.println();
    }

    // ===== Задача 4 и 5 =====
    static void task4And5() {
        Person person = new Student("Касым", 18, "ИС-24-21");

        person.printInfo();
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4And5();
    }
}

// ===== Задача 3. Класс с областью видимости =====
class ScopeExample {
    int classField = 100; // поле класса

    void showValues() {
        int localVariable = 50; // локальная переменная
        System.out.println("Поле класса: " + classField);
        System.out.println("Локальная переменная: " + localVariable);
    }
}

// ===== Задача 4. Базовый класс =====
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ===== Задача 5. Метод для переопределения =====
    void printInfo() {
        System.out.println("Человек: " + name + ", возраст: " + age);
    }
}

// ===== Производный класс =====
class Student extends Person {
    String group;

    Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    // Переопределение метода
    @Override
    void printInfo() {
        System.out.println(
                "Студент: " + name +
                        ", возраст: " + age +
                        ", группа: " + group
        );
    }
}
