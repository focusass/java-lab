public class Task14 {
    public static void main(String[] args) {
        int[] D = new int[30];
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < D.length; i++) {
            D[i] = (int) (Math.random() * 21) - 10;
            if (D[i] % 2 == 0) {
                evenSum += D[i];
            } else {
                oddSum += D[i];
            }
        }

        System.out.println("Сумма чётных элементов: " + evenSum);
        System.out.println("Сумма нечётных элементов: " + oddSum);
    }
}