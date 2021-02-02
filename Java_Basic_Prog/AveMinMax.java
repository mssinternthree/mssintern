import java.util.Scanner;
public class AveMinMax {

	public static void main(String[] args) {
		int ave=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 10 numbers : ");
		int sum=0;
		int max=0;
		int min=100000;
		for(int i=0;i<10;i++) {
			int no=in.nextInt();
			sum+=no;
			if(no>max) {
				max=no;
			}
			if(no<min) {
				min=no;
			}
			ave = (sum/10);
		}
		
		System.out.println("Average:" + ave + " Max:"+max+" Min:"+min);

		

	}

}
