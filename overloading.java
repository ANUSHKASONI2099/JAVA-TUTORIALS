public class overloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1, 3));
        System.out.println(cal.sum((float) 1.5, (float) 7.8, (float) 4.6));

    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b, float c) {
        return a + b + c;
    }
}
