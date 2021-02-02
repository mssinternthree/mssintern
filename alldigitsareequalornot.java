package mssintern;

import java.util.Scanner;

public class alldigitsareequalornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number to check equal or not"); 
		int c= scan.nextInt();
				int[] numb = new int[c];
				
				for(int i=0;i<c;i++) {
					System.out.println("enter number "+(i+1)+" ");
					numb[i] = scan.nextInt();
				}
			int	check=numb[0];
				for(int i=0;i<c;i++) {
					if(numb[i]==check)
						count++;
				}


	}

}
