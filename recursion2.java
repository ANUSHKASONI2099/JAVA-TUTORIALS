public class recursion2 {
    public static void printInc(int n) {
        if (n == 10) {
            System.out.println(10);
            return;
        }
        System.out.println(n + " ");
        printInc(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printInc(n);
    }
}
