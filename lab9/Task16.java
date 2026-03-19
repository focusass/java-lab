public class Task16 {

    static class Car {
        String brand;
        int speed;

        Car(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        void displayInfo() {
            System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
        }

        void fuelConsumption() {
            System.out.println("Fuel consumption not defined");
        }
    }

    static class Sedan extends Car {
        Sedan(String brand, int speed) {
            super(brand, speed);
        }

        @Override
        void fuelConsumption() {
            System.out.println("Sedan fuel consumption: 7 liters/100km");
        }
    }

    static class Truck extends Car {
        Truck(String brand, int speed) {
            super(brand, speed);
        }

        @Override
        void fuelConsumption() {
            System.out.println("Truck fuel consumption: 20 liters/100km");
        }
    }

    static class SUV extends Car {
        SUV(String brand, int speed) {
            super(brand, speed);
        }

        @Override
        void fuelConsumption() {
            System.out.println("SUV fuel consumption: 10 liters/100km");
        }
    }

    public static void main(String[] args) {

        Sedan sedan = new Sedan("Toyota", 180);
        Truck truck = new Truck("Volvo", 120);
        SUV suv = new SUV("BMW", 160);

        sedan.displayInfo();
        sedan.fuelConsumption();

        truck.displayInfo();
        truck.fuelConsumption();

        suv.displayInfo();
        suv.fuelConsumption();
    }
}