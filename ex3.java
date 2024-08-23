public class ex3 {
    public static void main(String[] args) {
        Marks m1 = new Marks(34, 56);
        System.out.println(m1.mathMarks);
        System.out.println(m1.physicsMarks);

    }
}

class Marks {
    int mathMarks;
    int physicsMarks;

    Marks(int mathMarks, int physicsMarks) {
        this.mathMarks = mathMarks;
        this.physicsMarks = physicsMarks;
    }
}
