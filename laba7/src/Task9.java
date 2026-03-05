public class Task9 {
    public static void main(String[] args) {
        double[][] C = new double[5][5];
        double product = 1;
        boolean hasPositive = false;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = Math.random() * 20 - 10;
            }
        }
        for (int i = 0; i < C.length; i++) {
            if (C[i][i] > 0) {
                product *= C[i][i];
                hasPositive = true;
            }
        }
        if (hasPositive) {
            System.out.println("Произведение положительных элементов главной диагонали: " + product);
        } else {
            System.out.println("Положительных элементов на главной диагонали нет.");
        }
    }
}