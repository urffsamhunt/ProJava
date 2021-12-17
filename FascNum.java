package ProJava;

import java.util.Scanner;

public class FascNum
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit and the upper limit: ");
        int l = scanner.nextInt();
        int u = scanner.nextInt();

        for (int i = l; i<=u; i++) {
            if (ISFasc(i)) 
            System.out.println(i);
        }
        scanner.close();
    }
    static boolean ISFasc(int a)
    {
        String s = ""+(a)+(a*2)+(a*3);
        for (int i = 1; i<=9; i++) {
            char ch = (i+"").charAt(0);
            if(s.indexOf(ch)!=s.lastIndexOf(ch)||s.indexOf(ch)==-1)   
            return false;
        }
        return true;
    }
}