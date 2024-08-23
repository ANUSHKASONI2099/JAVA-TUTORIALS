public class equals {
    public static void main(String args[]) {
        String str1 = "Rahul";
        String str2 = new String("Rahul");
        if (str1.equals(str2)) {
            System.out.print("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

}