public class Task17 {
    public static void main(String[] args) {
        String s1 = "Hello ";
        String s2 = "World!";
        String s3 = "Java!";
        String s4 = "test";
        String s5 = "test";

        if (s4.equals(s5)) {
            String result = s1 + s2;
            System.out.println("Результат: " + result);
        } else {
            String result = s1 + s3; 
            System.out.println("Результат: " + result);
        }
    }
}