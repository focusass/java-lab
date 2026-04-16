import java.util.*;

public class Task18 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,2,3,4,4,5);

        nums.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }
}