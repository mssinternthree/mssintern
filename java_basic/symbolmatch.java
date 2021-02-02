package java_day1;
import java.util.Scanner;
public class symbolmatch {
   public static void main( String[] args)
   {
	    char ch;
	    Scanner sym=new Scanner(System.in);
	    System.out.println("Enter a single letter or digit or symbol:");
	    ch=sym.next().charAt(0);
	    int ascii = ch;
	    if(ch>='A' && ch<='Z')
	    {
	    	System.out.println("It is Upper case letter");
	    }
	    else if(ch>='a' && ch<='z' )
	    {
	    	System.out.println("It is lower case letter");
	    }
	    else if(ch>=0 && ch<=9){
	    	System.out.println("It is a digit");
	    }
	   
	    else if ( (ascii>=32 &&ascii<=47) || (ascii>=58 &&ascii<=64)||(ascii>=391 && ascii<=96)||(ascii>=123 && ascii<=127)){
	    	System.out.println("It is a special symbol");
	    }
	    else {
	    	System.out.println("Enter valid input");
	    }
	    
   }
}
