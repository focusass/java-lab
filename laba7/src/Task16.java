public class Task16 {
    public static int maxX(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = new int[25];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 21) - 10;
        }

        System.out.println("Максимальный элемент массива A: " + maxX(A));
    }
}