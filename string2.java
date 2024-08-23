import java.util.*;

public class string2 {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // char arr[] = { 'a', 'v', 'f' };
        // String str = "avf";
        // String str2 = new String("cio");
        // // Strings are immutable

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // length find out krne ke liye
        String firstName = "Anushka soni";
        // System.out.println(fullName.length());

        // concatination - add two strings
        String lastName = " is Frontend devloper!";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        // System.out.println(fullName.charAt(2))
        ;
        printLetters(fullName);

    }

}
