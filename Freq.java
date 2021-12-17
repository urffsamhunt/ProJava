package ProJava;

import java.util.Scanner;

public class Freq
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        while (s.length() > 0)
        {
            String m = ""+s.charAt(0);
            String n = s.replaceAll(m,"");
            System.out.println("Frequency of " + m+" is : "+(s.length() - n.length()));
            s = n;
        }
        sc.close();
    }
}