public class direction {
    public static float shortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dirr = path.charAt(i);

            if (dirr == 'S') {
                y--;
            } else if (dirr == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "NS";
        System.out.println(shortestPath(path));
    }
}
