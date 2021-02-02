package java_day1;
import java.util.Scanner;
public class calculator {
   public static void main( String[] args)
   {
	    int choice,a,b;
	    Scanner cal=new Scanner(System.in);
	    System.out.printf("MENU\n1.ADD\n2.SUB\n3.MUL\nChoose one from above MENU: ");
	    choice=cal.nextInt();
	    System.out.println("Enter A :");
	    a=cal.nextInt();
	    System.out.println("Enter B :");
	    b=cal.nextInt();
	    if(choice==1)
	    {
	    	int c=a+b;
	     	System.out.println("Addition of "+a+" and "+b+"is "+c);
	    }
	    else if(choice==2)
	    {
	    	int c=a-b;
	     	System.out.println("Substraction of "+a+" and "+b+"is "+c);
	    }
	    else if(choice==3)
	    {
	    	int c=a*b;
	     	System.out.println("Multiplication of "+a+" and "+b+"is "+c);
	    }
 else {
	    	System.out.println("Enter valid input");
	    }
	    
   }
}
