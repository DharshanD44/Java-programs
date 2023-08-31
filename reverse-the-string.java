import java.io.*;
import java.util.Scanner;
 
class reversestring {
    public static void main (String[] args) {

       Scanner s=new Scanner(System.in);
        String str, nstr="";
        char ch;
       
      System.out.print("Enter the original/main String: ");
      str=s.nextLine();
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("\nReversed String is: "+ nstr);
    }
}