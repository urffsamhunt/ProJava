package ProJava;

import java.util.*;

public class EqualizeNum {
    public static int sumOfDigits(int input){
        int sum = 0;
        while (input!=0)
        {
            int d = input%10;
            sum = sum + d;
            input = input/10;
        }
        return sum;
    }
    public static void main(String Args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number M Greater than 100 but less than 10000 :");
        int M=in.nextInt();
        System.out.print("Enter a number N :");
        int N=in.nextInt();
        int output=M;
        int sum;
        while (true){
            sum=sumOfDigits(output);
            if(sum==N){
                break;
            }
            output++;
        }
        System.out.print("The required Output is "+output);
        in.close();
    }}
