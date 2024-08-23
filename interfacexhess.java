public class interfacexhess {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("moves all direction");

    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("move up and down");

    }
}
