import java.util.Scanner;

public class number10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Результат: " + (a + b));
                break;
            case '-':
                System.out.println("Результат: " + (a - b));
                break;
            case '*':
                System.out.println("Результат: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Результат: " + (a / b));
                } else {
                    System.out.println("Ошибка: деление на ноль");
                }
                break;
            default:
                System.out.println("Неизвестная операция");
        }

        scanner.close();
    }
}
