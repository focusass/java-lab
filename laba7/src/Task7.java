public class Task7 {
    public static void main(String[] args) {
        int[][] B = new int[5][5];
        int[] A = new int[5];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = (int) (Math.random() * 21) - 10;
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                if (B[i][j] > 0) {
                    A[i] += B[i][j];
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.println("Строка " + i + ": " + A[i]);
        }
    }
}