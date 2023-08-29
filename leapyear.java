import java.io.*;
import java.util.*;
public class Main 
{
      public static void main(String[] args)
    {

    Scanner s=new Scanner(System.in);
    int year =s.nextInt();
    boolean leap = false;

   	 if (year % 4 == 0)
	 {
		 // if the year is century
    		  if (year % 100 == 0) 
		{
			// if year is divided by 400
        			// then it is a leap year
        			if (year % 400 == 0)
        			  leap = true;
        			else
          			  leap = false;
      		}
	 // if the year is not century
     	 	else
       	  	  leap = true;
   	 }
	 else
    	    leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}
