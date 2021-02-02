package mssintern;

import java.util.Scanner;

public class neven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter how many evens you want to find");
		   int n=scan.nextInt();
		   for (int i=1;i<=n*2;i++) {
			   if(i%2==0);
			   {
				   System.out.println(i);
			   }
		   }
		   
	}

}
