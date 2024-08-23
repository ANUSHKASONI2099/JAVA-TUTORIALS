public class abstract1 {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        // animal--> horse--> mustang 

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken ch = new Chicken();
        // ch.walk();

    }

}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";

    }

    void eat() {
        System.out.println("Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor");
    }

    void changeColor() {
        color = "darkbrown";
    }

    void walk() {
        System.out.println("Walk on");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walk on two legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("constructor called");
    }
}
