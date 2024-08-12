public class hollowrec {
    public static void rec(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                // cell - i,j
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    

    }

    public static void main(String args[]) {
        rec(9, 9);

    }
}
