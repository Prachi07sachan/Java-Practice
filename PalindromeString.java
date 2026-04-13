import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String original = s.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");

        sc.close();
    }
}