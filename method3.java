import java.util.*;

public class method3 {
    public static void area(float rad) {
        float area = 3.14f * rad * rad;
        System.out.println("area is :" + area);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();

        area(rad);

    }
}
