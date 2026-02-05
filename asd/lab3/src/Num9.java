import java.util.Scanner;

public class Num9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите скорость (v) в км/ч: ");
        double v = scanner.nextDouble();

        System.out.print("Введите время (t) в часах: ");
        double t = scanner.nextDouble();

        double s = v * t;

        System.out.println("Пройденное расстояние: " + s + " км");
    }
}
