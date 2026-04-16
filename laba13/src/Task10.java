import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        int min = nums.stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println(min);
    }
}