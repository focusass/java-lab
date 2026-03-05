public class Task13 {
    public static void main(String[] args) {
        int[] C = new int[20];
        int sum = 0;
        for (int i = 0; i < C.length; i++) {
            C[i] = (int) (Math.random() * 21) - 10;
            sum += C[i];
        }

        double average = sum / (double) C.length;
        System.out.println("Среднее значение массива C: " + average);
    }
}