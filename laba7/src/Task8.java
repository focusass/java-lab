public class Task8 {
    public static void main(String[] args) {
        double[][] A = new double[12][6];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = Math.random() * 20 - 10;
            }
        }
        for (int j = 0; j < A[0].length; j++) {
            double product = 1;
            boolean hasNegative = false;
            for (int i = 0; i < A.length; i++) {
                if (A[i][j] < 0) {
                    product *= A[i][j];
                    hasNegative = true;
                }
            }
            if (hasNegative) {
                System.out.println("Произведение отрицательных элементов в столбце " + j + ": " + product);
            } else {
                System.out.println("Отрицательных элементов в столбце " + j + " нет.");
            }
        }
    }
}