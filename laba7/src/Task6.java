public class Task6 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int[] B = new int[10];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = (int) (Math.random() * 21) - 10;
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] < 0) {
                    B[i] += A[i][j];
                }
            }
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("Строка " + i + ": " + B[i]);
        }
    }
}