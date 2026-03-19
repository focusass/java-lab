public class Task1 {

    static class Transport {
        String name;
        int speed;

        Transport(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        void move() {
            System.out.println(name + " moves");
        }
    }

    static class Car extends Transport {
        Car(String n, int s) { super(n, s); }
        void move() { System.out.println(name + " drives"); }
    }

    static class Train extends Transport {
        Train(String n, int s) { super(n, s); }
        void move() { System.out.println(name + " runs"); }
    }

    static class Airplane extends Transport {
        Airplane(String n, int s) { super(n, s); }
        void move() { System.out.println(name + " flies"); }
    }

    public static void main(String[] args) {
        new Car("Car",120).move();
        new Train("Train",200).move();
        new Airplane("Plane",800).move();
    }
}