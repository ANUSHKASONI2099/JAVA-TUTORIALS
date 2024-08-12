public class subarray {
    public static void sub_Array(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.err.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 7, 8, 9, };
        sub_Array(numbers);

    }
}
