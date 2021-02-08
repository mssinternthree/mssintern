package internjava;
import java.util.Scanner;

public class positive {
      public static void main(String args[])
      {   Scanner sc=new Scanner(System.in);  
    	  System.out.println("enter a number to check wheather it is positive or negative");
    	  int n= sc.nextInt(); 
    	  if(n>=0)
    	  {
    		  System.out.println(n+"  is a positive number");
    	  }
    	  else
    	  {
    		  System.out.println(n+"  is a negative number ");
    	  }
      }
 }
 
 