public class Stringbuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'm'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
