package java_day1;
import java.util.Scanner;
public class numchar {
   public static void main(String[] args)
   {
	    int no1;
	    char ch;
	    Scanner big=new Scanner(System.in);
	    System.out.println("Enter digit:");
	    no1=big.nextInt();
	    
	    System.out.println("Enter character:");
	    ch=big.next().charAt(0);
	   System.out.println("Digit : "+no1+"Character :"+ch);
	
   }
}
