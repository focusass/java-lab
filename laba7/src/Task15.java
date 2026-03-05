public class Task15 {
    public static void main(String[] args) {
        int[][] table = new int[3][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Таблица 3x5 случайных чисел:");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}