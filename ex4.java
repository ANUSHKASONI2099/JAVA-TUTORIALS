public class ex4 {
    public static void main(String args[]) {
        Makeupaccessories m1 = new Makeupaccessories("Hotlips", 1500);
        System.out.println(m1.Facepowder);
        System.out.println(m1.Price);

    }
}

class Makeupaccessories {
    String Facepowder;
    int Price;

    Makeupaccessories(String Facepowder, int Price) {
        this.Facepowder = Facepowder;
        this.Price = Price;
    }
}
