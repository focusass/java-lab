public class Task5 {
    public static void main(String[] args) {
        int[] D = new int[17];
        int sum = 0;
        for (int i = 0; i < D.length; i++) {
            D[i] = (int) (Math.random() * 21) - 10;
            sum += D[i];
        }
        double average = sum / (double) D.length;
        System.out.println("Среднее арифметическое элементов массива D: " + average);
    }
}