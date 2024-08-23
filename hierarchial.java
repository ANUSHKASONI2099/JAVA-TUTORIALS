public class hierarchial {
    public static void main(String args[]) {

        Monkey brown = new Monkey();
        brown.eat();

        Fish Shark = new Fish();
        Shark.swim();
        Shark.breathe();

        Birds Crow = new Birds();
        Crow.eat();
        Crow.fly();
    }
}

class Animal {
    void breathe() {
        System.out.println("Live");
    }

    void eat() {
        System.out.println("Eats");
    }
}

class Monkey extends Animal {
    void jump() {
        System.out.println("Jumps");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("Fly in sky");
    }
}