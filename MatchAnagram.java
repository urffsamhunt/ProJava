package ProJava;

import java.util.Scanner;

public class MatchAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two strings ");
        String s1 = scanner.next().toLowerCase();
        String s2 = scanner.next().toLowerCase();
        if (frequency(s1, s2))
        System.out.println("They are anagrams");
        else
        System.out.println("They are not Anagrams");
        scanner.close();
    }

    static boolean frequency(String s, String s1)
    {
        while (s.length() > 0)
        {
            String m = ""+s.charAt(0);
            String n = s.replaceAll(m,"");
            String n1 = s1.replaceAll(m,"");
            if(s.length()-n.length() != s1.length()-n1.length())
            return false;
            s =n;
        }return true;
    }   
}
