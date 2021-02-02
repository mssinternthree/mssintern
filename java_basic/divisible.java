package java_day1;
import java.util.Scanner;
public class divisible {
   public static void main(String[] args)
   {
	    int n;
	    Scanner div=new Scanner(System.in);
	    n=div.nextInt();
	    if(n%3==0 && n%5==0)
	    {
	    	System.out.println(n+" is divisible by both 3 & 5");
	    }
	    else {
	    	System.out.println(n+" is not divisible by both 3 & 5");
	    }
   }
}
