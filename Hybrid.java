public class Hybrid {
    public static void main(String args[]) {

    }
}

class Animal {
    void eat() {
        System.out.println("Eats");

    }

    void Breathe() {
        System.out.println("Take oxygen");
    }
}

class Bird extends Animal {
    class Peacock extends Bird {
        void color() {
            System.out.println("Blue mix Green");
        }
    }
}
