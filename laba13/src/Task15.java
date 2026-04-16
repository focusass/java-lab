import java.util.*;

public class Task15 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        nums.stream()
                .filter(n -> n > 2)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);
    }
}