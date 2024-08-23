public class ithbit {
    public static int getIthBit(int n, int i) {
        int bitMarks = 1 << i;
        if ((n & bitMarks) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String args[]) {
        System.out.println(getIthBit(10, 2));
        // 10 = 1010
    }
}
