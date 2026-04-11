
import java.util.*;

public class ReplaceDuplicateWithQuestionMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        boolean found = false;

        for (char ch : s.toCharArray()) {

            if (ch == ' ') {
                result.append(ch);
                continue;
            }

            if (set.contains(ch)) {
                result.append("?");
                found = true;
            } else {
                set.add(ch);
                result.append(ch);
            }
        }

        if (found)
            System.out.println(result);
        else
            System.out.println("No duplicates present in the given string");

        sc.close();
    }
}