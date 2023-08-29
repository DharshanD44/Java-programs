import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args) {
    int rows;
    Scanner s=new Scanner(System.in);
  rows=s.nextInt();
   for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}



//Program to print Pattern
         *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
....etc
/*
import java.io.*;
import java.util.*;
public class Main {

  public static void main(String[] args) {
     int rows, k = 0;
    Scanner s=new Scanner(System.in);
    rows=s.nextInt();
    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}*/
