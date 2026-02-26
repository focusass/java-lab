public class Task3 {
    
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int intMax = max(5, 10);
        System.out.println("Максимум среди целых чисел: " + intMax);

        double doubleMax = max(3.5, 7.2);
        System.out.println("Максимум среди чисел с плавающей точкой: " + doubleMax);
    }
}