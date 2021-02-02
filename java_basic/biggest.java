package java_day1;
import java.util.Scanner;
public class biggest {
   public static void main(String[] args)
   {
	    int no1,no2;
	    Scanner big=new Scanner(System.in);
	    System.out.println("Enter no1:");
	    no1=big.nextInt();
	    System.out.println("Enter no2:");
	    no2=big.nextInt();
	    if(no1>no2)
	    {
	    	System.out.println(no1+"is bigger than "+no2);
	    }
	    else if(no2>no1) {
	     	System.out.println(no2+" is bigger than "+no1);
	    }
	    else if(no1==no2)
	    {
	    	System.out.println(no1+"is equals to "+no2);
	    }
	    else {
	    	
	    }
   }
}
