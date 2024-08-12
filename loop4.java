import java.util.*;

public class loop4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your no. : ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                break;
            }
            System.out.println();
        } while (true);

    }
}
