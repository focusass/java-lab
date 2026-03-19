public class Task10 {

    static class Product {
        double price;
        Product(double p){ price=p; }

        void showPrice(){ System.out.println(price); }
    }

    static class Food extends Product {
        Food(double p){ super(p); }
    }

    static class Electronics extends Product {
        Electronics(double p){ super(p); }
    }

    static class Clothes extends Product {
        Clothes(double p){ super(p); }
    }

    public static void main(String[] args) {
        new Food(10).showPrice();
        new Electronics(200).showPrice();
        new Clothes(50).showPrice();
    }
}