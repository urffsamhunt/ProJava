import java.util.Scanner;
import java.util.regex.*;

public class MatchAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two strings ");
        String s1 = scanner.next().toLowerCase();
        String s2 = scanner.next().toLowerCase();
        MatchAnagram m = new RegExp(s2, "g");
        if (s1.replace("[s2]","").length() == 0 )
        System.out.println("The Two Strings are Anagrams");
        else System.out.println("The Two Strings are not anagrams");
        String re = "\\b"+s2+"\\b";
        System.out.println(s1.replace(re,""));
    }
}
