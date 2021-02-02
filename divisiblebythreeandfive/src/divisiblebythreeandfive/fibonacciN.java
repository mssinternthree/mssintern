package divisiblebythreeandfive;

import java.util.Scanner;

public class fibonacciN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n1=0,n2=1,n3,i;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<num;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		}

}
