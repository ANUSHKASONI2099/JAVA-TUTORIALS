public class clearlastithbit {
    public static int clearLastIthBit(int n, int i) {
        int bitMarks = (~0) << i;
        return n | bitMarks;
    }

    public static void main(String[] args) {
        System.out.println((clearLastIthBit(15, 2)));
    }
}
