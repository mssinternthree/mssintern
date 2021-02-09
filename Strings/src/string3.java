
import java.util.Scanner;
public class string3 {
   public static void main(String[] args)
   {
	    int n;
	    Scanner obj = new Scanner(System.in);
	    System.out.println("Enter a string :");
	    String str=obj.nextLine(); 
	    System.out.println("Enter a character to delete :");
	    //Scanner obj1 = new Scanner(System.in);
	    char c = obj.next().charAt(0); 
	    String str1=str.replace( c,' ');
	    System.out.println(str1);
	   
	   //n= obj.nextInt();
	   //for() 
	   
	  
			   
   }
}

