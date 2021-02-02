package divisiblebythreeandfive;

import java.util.Scanner;

public class dowhiletable {
		public static void main(String args[]) {
		    @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
		    int num;
		    System.out.println("Enter the number: ");
		    num=sc.nextInt();
		    int i=1;
		    do{
		    System.out.println(num+"x"+i+"="+num*i);
		     i++;
		    }while( i<=12);

		}

}
