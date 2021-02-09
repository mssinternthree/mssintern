
import java.util.Scanner;
public class string6 {
   public static void main(String[] args)
   {
	    int n,i=0;
	   String s;
	   Scanner obj = new Scanner(System.in);
	   System.out.println("Enter string:");
	   s= obj.nextLine();
	    String s1 = s.substring(0,1).toUpperCase();
	    String s2 = s1 + s.substring(1);
	    System.out.println(s2);
	   // for (int i=0)
	
   }
}


