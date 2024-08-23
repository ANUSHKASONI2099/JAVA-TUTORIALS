public class updateithbit {
    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n = clearithbit(n,i);
        int bitMarks = newBit<<i;
        return n | bitMarks;
    }

    public static void main(String[] args) {
        System.out.println((updateIthBit(10, 2, 1)));
    }
}
