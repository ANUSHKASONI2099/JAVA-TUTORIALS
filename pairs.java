public class pairs {
    public static void arraypairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i <= numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + " ," + numbers[j] + ")");
                tp++;
            }

            System.out.println();
            // total number of pairs = n(n-1)/2

        }
        System.out.println("total pairs" + tp);

    }

    public static void main(String args[]) {
        int numbers[] = { 3, 5, 6, 7, 8, 9 };
        arraypairs(numbers);

    }
}
