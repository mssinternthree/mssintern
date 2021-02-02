package java_day1;
import java.util.Scanner;
public class big {
   public static void main(String[] args)
   {
	    int no1,no2,no3;
	    Scanner big=new Scanner(System.in);
	    System.out.println("Enter no1:");
	    no1=big.nextInt();
	    System.out.println("Enter no2:");
	    no2=big.nextInt();
	    System.out.println("Enter no3:");
	    no3=big.nextInt();
	   System.out.println(((no1>no2) &&(no1>no3))?no1+" is big":((no2>no3)?no2+" is big":no3+" is big"));
	
   }
}
