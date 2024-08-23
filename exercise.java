public class exercise {
    public static void main(String args[]) {
        Fruits apple = new Fruits();
        apple.price();

        Cloths Skirt = new Cloths();
        Skirt.color();

    }
}

class Vegetables {
    void color() {
        System.out.println("pink");
    }

    void price() {
        System.out.println("200/kg");

    }

}

class Fruits extends Vegetables {

}

class Cloths extends Vegetables {

}