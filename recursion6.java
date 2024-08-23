public class recursion6 {
    public static int mulNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int mulnm1 = mulNatural(n - 1);
        int muln = n * mulNatural(n - 1);
        return muln;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(mulNatural(n));
    }
}
