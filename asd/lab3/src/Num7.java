import java.util.Scanner;

public class Num7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        double pi = 3.14;
        double area = pi * radius * radius;

        System.out.println("Площадь круга: " + area);
    }
}
