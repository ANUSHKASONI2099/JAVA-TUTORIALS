public class staticex {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "abc";

        // Student s2 = new Student();
        // s2.SchoolName = "abc";

    }
}

class Student {

    static int returnPercentage(int maths, int physics, int chemistry) {
        return (maths + physics + chemistry) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;

    }

    String getName() {
        return this.name;
    }
}
