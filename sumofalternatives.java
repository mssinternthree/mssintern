package mssintern;

import java.util.Scanner;

public class sumofalternatives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,sum=0;
		Scanner scan = new Sca
				nner(System.in);
		System.out.println("enter number of numbers you want to enter");
		int c= scan.nextInt();
		int[] numb = new int[c];
		for(int i=0;i<c;i++) {
			System.out.println("enter number "+(i+1)+" ");
			numb[i] = scan.nextInt();
				}
		for(int j=0;j<c;j++) {
			if(j%2==0) {
				sum+=numb[j];
			}
		}
		System.out.println(sum);


	}

}
