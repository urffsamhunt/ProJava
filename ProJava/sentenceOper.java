package ProJava;

import java.util.*;
public class sentenceOper {
    static Scanner in=new Scanner(System.in);
    public static String shift(String input){
        String output="";char c1;int c;
        int l=input.length();
        for(int i=0;i<l;i++){
            c1=input.charAt(i);
            c=(int)c1+1;
            c1=(char)c;
            output=output+c1;
        }
        return output;
    }
    public static String checker(String input){
        String output="";char c1;int c;
        int l=input.length();
        for (int i=0;i<l;i++){
            c1=input.charAt(i);
            c=(int)c1;
            if(c<65&&c!=32){
                c=c-1;
                c1=(char)c;
            }
            output=output+c1;
        }
        return output;
    }
    public static void main(String Args[]){
        System.out.print("Enter your Sentence   :");
        String input=in.nextLine();String output="";
        //String Tokenizer
        StringTokenizer st=new StringTokenizer(input);
        int l=st.countTokens();
        String words[]=new String[l];
        for(int i=0;i<l;i++){
            words[i]=st.nextToken();
        }
        System.out.print("Enter Integers    :");
        String inpInt=in.nextLine();
        Scanner sc=new Scanner(inpInt);
        sc.useDelimiter(",");
        int p1=sc.nextInt()-1;
        int p2=sc.nextInt()-1;
        for(int i=0;i<l;i++){
            if(i==p1||i==p2){
                words[i]=shift(words[i]);
            }
        }
        //Display output
        for(int i=0;i<l;i++){
            output=output+words[i]+" ";
        }
        output=checker(output);
        System.out.println(output);
    }
}