import java.util.*;

public class Task20 {

    static class Order {
        int amount;

        Order(int a) {
            amount = a;
        }
    }

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(500),
                new Order(1500),
                new Order(2000)
        );

        orders.stream()
                .filter(o -> o.amount > 1000)
                .sorted((a, b) -> a.amount - b.amount)
                .forEach(o -> System.out.println(o.amount));
    }
}