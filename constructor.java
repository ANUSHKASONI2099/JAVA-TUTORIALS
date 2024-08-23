public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Mom");
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int rollNo;

    Student(String newName) {
        name = newName;
        //this.name = name

    }
}