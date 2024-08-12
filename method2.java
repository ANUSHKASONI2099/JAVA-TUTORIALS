import java.util.*;

public class method2 {
    public static void para(int a, int b) {
        int para = 2 * a * b;
        System.out.println("parameter is :" + para);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        para(a, b);
    }

}
