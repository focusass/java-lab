public class Task15 {

    static class Appliance {
        void operate(){ System.out.println("work"); }
    }

    static class Refrigerator extends Appliance {
        void operate(){ System.out.println("cool"); }
    }

    static class WashingMachine extends Appliance {
        void operate(){ System.out.println("wash"); }
    }

    static class Microwave extends Appliance {
        void operate(){ System.out.println("heat"); }
    }

    public static void main(String[] args) {
        new Refrigerator().operate();
        new WashingMachine().operate();
        new Microwave().operate();
    }
}