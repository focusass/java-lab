public class Task8 {

    static class Vehicle {
        void startEngine(){ System.out.println("start"); }
    }

    static class Bike extends Vehicle {
        void startEngine(){ System.out.println("bike"); }
    }

    static class Bus extends Vehicle {
        void startEngine(){ System.out.println("bus"); }
    }

    static class Taxi extends Vehicle {
        void startEngine(){ System.out.println("taxi"); }
    }

    public static void main(String[] args) {
        new Bike().startEngine();
        new Bus().startEngine();
        new Taxi().startEngine();
    }
}