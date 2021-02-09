
import java.util.Scanner;
public class ternary {
   public static void main(String[] args)
   {
	    int no1,no2;
	    Scanner big=new Scanner(System.in);
	    System.out.println("Enter no1:");
	    no1=big.nextInt();
	    System.out.println("Enter no2:");
	    no2=big.nextInt();
	   System.out.println((no1<no2)?no2+" is big":no1+" is big");
	
   }
}
