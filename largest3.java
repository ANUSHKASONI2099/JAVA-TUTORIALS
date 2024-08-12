public class largest3 {
    public static void main(String args[]) {
        int a = 1;
        int b = 3;
        int c = 6;
        if (a >= b && a >= c) {
            System.out.println("a");
        } else if (b >= c) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }
    }
}
