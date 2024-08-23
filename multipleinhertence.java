public class multipleinhertence {
    public static void main(String[] args) {
        Beer b = new Beer();
        b.eat();
        b.color();

    }
}

interface Carnivores {
    void eat();
}

interface Harvivores {
    void eat();

    void color();
}

class Beer implements Carnivores, Harvivores {
    public void eat() {
        System.out.println("eat both");
    }

    public void color() {
        System.out.println("brown");
    }

}
