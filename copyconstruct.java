public class copyconstruct {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Anushka";
        s1.roll = 234;
        s1.password = "anu1";
        s1.marks[0] = 40;
        s1.marks[1] = 70;
        s1.marks[2] = 90;

        Student s2 = new Student(s1);
        s2.password = "anu2";
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);

        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks;

    // Student(Student s1) { // shalow copy constructor
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }


    // deep copy constructor
    Student(Student s1){

        marks = new int[3];
        

    }

    Student() {
        System.out.println("nothing");
    }

    Student(String name, int roll, String password) {
        this.name = name;
        this.roll = roll;
        this.password = password;
    }
}
