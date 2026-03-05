public class Task12 {
    public static void main(String[] args) {
        int[] B = new int[25];
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 21) - 10;
        }

        for (int i = 0; i < B.length - 1; i++) {
            for (int j = i + 1; j < B.length; j++) {
                if (B[i] > B[j]) {
                    int temp = B[i];
                    B[i] = B[j];
                    B[j] = temp;
                }
            }
        }

        System.out.print("Отсортированный массив B: ");
        for (int i : B) {
            System.out.print(i + " ");
        }
    }
}