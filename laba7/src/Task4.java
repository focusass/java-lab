public class Task4 {
    public static void main(String[] args) {
        double[] C = new double[25];
        double product = 1;
        boolean hasPositive = false;
        for (int i = 0; i < C.length; i++) {
            C[i] = Math.random() * 20 - 10;
            if (C[i] > 0) {
                product *= C[i];
                hasPositive = true;
            }
        }
        if (hasPositive) {
            System.out.println("Произведение положительных элементов: " + product);
        } else {
            System.out.println("Положительных элементов нет.");
        }
    }
}