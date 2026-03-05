public class Task10 {
    public static void main(String[] args) {
        double[][] D = new double[7][7];
        double sum = 0;
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D[i].length; j++) {
                D[i][j] = Math.random() * 20 - 10;
            }
        }
        for (int i = 0; i < D.length; i++) {
            sum += D[i][i];
        }
        double average = sum / D.length;
        System.out.println("Среднее арифметическое элементов главной диагонали: " + average);
    }
}