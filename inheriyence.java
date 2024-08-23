public class inheriyence {
    public static void main(String args[]) {
        Fish Shark = new Fish();
        Shark.eat();

    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.err.println("Eats");

    }

    void breathe() {
        System.out.println("Breathe");
    }

}

class Fish extends Animal {

}