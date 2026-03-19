public class Task3 {

    static class Employee {
        String name;
        double salary;

        Employee(String n,double s){ name=n; salary=s; }

        void work(){ System.out.println(name+" works"); }
    }

    static class Manager extends Employee {
        Manager(String n,double s){ super(n,s); }
        void work(){ System.out.println(name+" manages"); }
    }

    static class Developer extends Employee {
        Developer(String n,double s){ super(n,s); }
        void work(){ System.out.println(name+" codes"); }
    }

    static class Designer extends Employee {
        Designer(String n,double s){ super(n,s); }
        void work(){ System.out.println(name+" designs"); }
    }

    public static void main(String[] args) {
        new Manager("Ali",1000).work();
        new Developer("John",1200).work();
        new Designer("Anna",900).work();
    }
}