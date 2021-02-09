
import java.util.Scanner;
public class string5 {
   public static void main(String[] args)
   {
	    int n,count=0,count1=0;
	    Scanner obj = new Scanner(System.in);
	    System.out.println("Enter a string :");
	    String str=obj.nextLine(); 
	    
	    for(int i=str.length()-1; i>=0;i--)
	    {
	    	 System.out.print(str.charAt(i));
	    }
	   // System.out.println(str);
	}
}

