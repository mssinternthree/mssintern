
import java.util.Arrays;

//import java.util.Scanner;
public class string9 {
   public static void main(String[] args)
   {
	   // int ,i=0,j=0;
	   String s="lazar";
	  
     System.out.println(s.length());
	   char c[]=s.toCharArray();
	    Arrays.sort(c);
	    System.out.println("Alphabetical Order: ");
	    System.out.println(c);
	    System.out.println("Reverse Alphabetical Order: ");
	  for(int i=c.length-1;i>=0;i--)
	  {
		  System.out.print(c[i]);
	  }
}
   }


