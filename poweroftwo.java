public class poweroftwo {
    public static boolean powerOftwoOrnot(int n) {
        return (n & (n - 1)) == 0;

    }

    public static void main(String[] args) {
        System.err.println(powerOftwoOrnot(8));
    }
}
