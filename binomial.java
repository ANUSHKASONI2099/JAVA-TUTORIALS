public class binomial {
    // public static void fact(int n) {
    // int f = 1;
    // for (int i = 1; i <= n; i++) {
    // f = f * i;

    // }

    // return f;

    // }
    // }

    public static int coefficient(int n, int r) {
        int fact_n = f(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n - r);

        int coefficient = fact_n / (fact_r * fact_nmr);
        return coefficient;

    }

    public static void main(String args[]) {
        System.out.println(coefficient(5, 1));
    }
}
