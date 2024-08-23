public class recursion3 {
    public static void printMul(int n) {
        if (n == 10) {
            System.out.println(10);
            return;
        }
        System.out.println(n);
        printMul(n + 2);
    }

    public static void main(String[] args) {
        int n = 2;
        printMul(n);
    }
}
