public class Task5 {

    static class Person {
        String name;
        Person(String n){ name=n; }
    }

    static class Student extends Person {
        Student(String n){ super(n); }
        void study(){ System.out.println(name+" studies"); }
    }

    static class Teacher extends Person {
        Teacher(String n){ super(n); }
        void teach(){ System.out.println(name+" teaches"); }
    }

    static class Administrator extends Person {
        Administrator(String n){ super(n); }
        void manage(){ System.out.println(name+" manages"); }
    }

    public static void main(String[] args) {
        new Student("Ali").study();
        new Teacher("John").teach();
        new Administrator("Boss").manage();
    }
}