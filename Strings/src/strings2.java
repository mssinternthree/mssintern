
import java.util.Scanner;
public class strings2 {
   public static void main(String[] args)
   {
	    int n;
	   String s= "Lazar";
	   Scanner obj = new Scanner(System.in);
	   System.out.println("Enter n value to delete n characters:");
	   n= obj.nextInt();
	   //for() 
	   String s1= s.substring(n,s.length());
	   System.out.println(s1);
			   
   }
}
