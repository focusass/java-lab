import java.util.Scanner;

public class Num10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = scanner.nextDouble();

        double square = number * number;
        double cube = number * number * number;

        System.out.println("Квадрат числа: " + square);
        System.out.println("Куб числа: " + cube);
    }
}
