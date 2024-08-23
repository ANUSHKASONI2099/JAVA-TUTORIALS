public class setithbit {
    public static int setIthBit(int n, int i) {
        int bitMarks = 1 << i;
        return n | bitMarks;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
}
