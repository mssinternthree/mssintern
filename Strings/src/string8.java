
import java.util.Scanner;
public class string8 {
   public static void main(String[] args)
   {
	    int n,i=0,j=0;
	   String s;
	   Scanner obj = new Scanner(System.in);
	   System.out.println("Enter string:");
	   s= obj.nextLine();
	   char c1[]= s.toCharArray();
       for(char c:c1)
       {
    	   j++;
       }
       System.out.println(j);
   }
}


