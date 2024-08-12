import java.util.*;

public class largestarray {
    public static void large(int numbers[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        return large;

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 8, 9, 5, 90 };
        System.out.println(large(numbers));

    }
}
