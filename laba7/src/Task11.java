public class Task11 {
    public static void main(String[] args) {
        int[] A = new int[25];
        
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 21) - 10;
        }

        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[minIndex]) minIndex = i;
            if (A[i] > A[maxIndex]) maxIndex = i;
        }

        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;

        for (int i : A) System.out.print(i + " ");
    }
}