package ProJava;
import ProJava.Node;
import java.util.*;

public class linkedList {

    Node start,last;
    linkedList()
    {
        Node start = null;
        Node last = null;
    }


    static Scanner sc = new Scanner(System.in);
        public static void main (String arg[])
        {
            linkedList ob = new linkedList();
            int a;
            do
            {
                System.out.println("Enter 0, 1, 2 or 3");
                a = sc.nextInt();
                switch(a)
                {
                   case 1 : ob.addNode(); break;
                   case 3: ob.display();
                }
            } while (a!=0);
        }

        void addNode()
        {
            char ch;
            do 
            {   
                Node temp = new Node();
                System.out.println("Enter the value");
                temp.n = sc.nextInt();
                if (start == null)
                {
                    start = last = temp;
                }
                else 
                {
                    last.next = temp;
                    last = temp;
                }
                System.out.println("Add more?");
                ch = sc.next().charAt(0);
            } while (ch!='0');
        }

        void display()
        {
            System.out.println("\n-------- List --------\n");
            for (Node curr = start; curr!=null;curr = curr.next)
            System.out.print(curr.n + " ");
            System.out.println("\n\n----------------------\n");
        }

}
