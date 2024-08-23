public class superkey {
    public static void main(String[] args) {
        Horse h = new Horse();
        // System.out.println(h.color);

    }
}

class Animal {
   Animal() {
        System.out.println("animal constuctor");
    }
}

class Horse extends Animal {
    Horse() {
        super();
        // super.color = "brown";
        System.out.println("annn");
    }
}
