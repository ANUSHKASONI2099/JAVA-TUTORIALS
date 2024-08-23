public class bitmanupulation {
    public static void evenOrOdd(int n) {
        int bitPrint = 1;
        if ((n & bitPrint) == 0) {
            System.out.println("Even numbers");
        } else {
            System.out.println("Odd numbers");
        }
    }

    public static void main(String[] args) {
        evenOrOdd(3);
    }

}
