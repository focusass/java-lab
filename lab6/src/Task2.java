import java.util.Scanner;

public class Task2 {
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        boolean result = isEven(number);

        if (result) {
            System.out.println(number + " — четное число.");
        } else {
            System.out.println(number + " — нечетное число.");
        }
    }
}