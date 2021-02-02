import java.util.Scanner;
public class calBySimpleMenu {
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter a");
		a=scan.nextInt();
		 System.out.println("enter b");
		b=scan.nextInt();
		System.out.printf("Select the option \n 1)Add \n 2)Sub \n 3)Mul \n 4)div");
		int choice =scan.nextInt();
		switch(choice) {
		  case 1:
			  System.out.println(a+b);
		    break;
		  case 2:
			  System.out.println(a-b);
		    break;
		  case 3:
			  System.out.println(a*b);
			    break;
		  case 4:		 
			  System.out.println(a%b);
			    break;
		  default:
			  System.out.println("wrong option");
		}
	}
}
