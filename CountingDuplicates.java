package ProJava;

import java.util.*;
class CountingDuplicates {
  public static int duplicateCount(String text) {
    text=text.toLowerCase();
    int count = 0;
    for (int i=0;i<text.length();i++)
      {
      if (text.charAt(i)==' ')
        continue;
      int first = text.indexOf(text.charAt(i));
      int last = text.lastIndexOf(text.charAt(i));
      if (first != last)
        {
        String m = ""+text.charAt(i);
        count++;
        text=text.replaceAll(m, " ");
        }
     }
    return count;
  }

  public static void main(String arg[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the sentence");
    System.out.println(duplicateCount(sc.nextLine()));
    sc.close();
  }
}
