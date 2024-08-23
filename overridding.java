public class overridding { // do alg alg class me same function ho tb child class vala function hi run
                           // karta hai
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();

    }
}

class Animal {
    void eat() {
        System.err.println("Eats");

    }

}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats grass");
    }
}
