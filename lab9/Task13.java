public class Task13 {

    static class Course {
        void startCourse(){ System.out.println("start"); }
    }

    static class ProgrammingCourse extends Course {
        void startCourse(){ System.out.println("programming"); }
    }

    static class MathCourse extends Course {
        void startCourse(){ System.out.println("math"); }
    }

    static class HistoryCourse extends Course {
        void startCourse(){ System.out.println("history"); }
    }

    public static void main(String[] args) {
        new ProgrammingCourse().startCourse();
        new MathCourse().startCourse();
        new HistoryCourse().startCourse();
    }
}