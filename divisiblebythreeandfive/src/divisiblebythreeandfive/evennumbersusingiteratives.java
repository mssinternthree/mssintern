package divisiblebythreeandfive;

import java.util.Scanner;

public class evennumbersusingiteratives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int i = 0 ,j = 1;
		System.out.println("Using while : ");
		while(j<=num) {
			if(i%2==0) {
				System.out.println("even number"+j+"   "+i);
				j++;
			}
			i++;
		}
		System.out.println("using do while : ");
		i = 0 ;
		j = 1;
		do {
			if(i%2==0) {
				System.out.println("even number"+j+"   "+i);
				j++;
			}
			i++;
		}while(j<=num);
		j = 1;
		System.out.println("using for loop : ");
		for(i=0;j<=num;i++) {
			if(i%2==0) {
				System.out.println("even number"+j+"   "+i);
				j++;
			}
		}
	}

}
