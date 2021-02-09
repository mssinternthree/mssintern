
import java.util.Scanner;
public class string7 {
   public static void main(String[] args)
   {
	    int n,count=0,count1=0;
	    Scanner obj = new Scanner(System.in);
	    System.out.println("Enter first string :");
	    String str1=obj.nextLine(); 
	    System.out.println("Enter second string :");
	    String str2=obj.nextLine();
	    if(str1.length()==str2.length())
	    {
	    	 for(int i=0;i<str1.length();i++)
	 	    {
	    		 if(str1.charAt(i)!=str2.charAt(i))
	    		 {
	    			 System.out.println("Strings are not equal");
	    			break;
	    			 
	 	         }
	    		 else {
	    			 count++;
	    		 }
	 	    }
	    	 if(count==str1.length())
	    	 {
	    	 System.out.println("Strings are equal");
	    	 }
	    }
	    else {
	    	System.out.println("Strings are not equal");
	    }
	   
	   // System.out.println(str);
	}
}

