public class clearithbit {
    public static int clearIthBit(int n, int i) {
        int bitMarks = ~(i << 1);
        return n & bitMarks;
    }

    public static void main(String[] args) {
        System.out.println((clearIthBit(10, 1)));
    }
}
