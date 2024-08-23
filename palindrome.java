public class palindrome {
    public static void isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }

        }

    }

    public static void main(String args[]) {
        String str = "mom";
        isPalindrome(str);

    }
}
