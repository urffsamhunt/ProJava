package ProJava;
import java.util.Arrays;
import java.util.Scanner;

public class Expensive {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        if (b<keyboards[0]+drives[0])
            return -1;
        int max = b;
        for (int i = keyboards.length-1; i>=0; i--)
        {
            for (int j = drives.length-1; j>=0; j--)
            {
                int p = b-keyboards[i];
                if (p==0)
                continue;
                if (p>=drives[j])
                {
                    int nn = p-drives[j];
                    if (nn<max)
                    max=nn;
                }
            }
        }
        return (b-max);
    }

    public static void main(String arg[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Budget");
      int b = sc.nextInt();
      System.out.println("Enter the number of options for keyboards and USB drives");
      int keyboard[] = new int[sc.nextInt()];
      int drive[] = new int[sc.nextInt()];
      System.out.println("Enter the options for Keyboards");
      for (int i = 0; i<keyboard.length; i++)
      keyboard[i]=sc.nextInt();
      System.out.println("Enter the options for USB drives");
      for (int i = 0; i<drive.length; i++)
      drive[i]=sc.nextInt();

      System.out.println("The most expensive option consumes "+getMoneySpent(keyboard, drive, b)+" Dollars");
        sc.close();
    }
}
