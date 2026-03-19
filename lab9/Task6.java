public class Task6 {

    static class Device {
        String brand;
        int power;

        Device(String b,int p){ brand=b; power=p; }

        void turnOn(){ System.out.println(brand+" on"); }
    }

    static class Laptop extends Device {
        Laptop(String b,int p){ super(b,p); }
    }

    static class Smartphone extends Device {
        Smartphone(String b,int p){ super(b,p); }
    }

    static class Tablet extends Device {
        Tablet(String b,int p){ super(b,p); }
    }

    public static void main(String[] args) {
        new Laptop("HP",50).turnOn();
        new Smartphone("Samsung",20).turnOn();
        new Tablet("Apple",30).turnOn();
    }
}