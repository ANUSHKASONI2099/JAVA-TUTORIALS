public class palindrom {
    public static boolean palin(int number) {
        int sum = 0;
        int r = number;
        while (number > 0) {
            r = number % 10;
            sum = sum * 10 + r;
            number = number / 10;

        }

    }

    public static void main(String args[]) {
        palin(132);

    }

}
