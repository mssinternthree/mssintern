import java.util.Scanner;
public class rank {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Math Subject marks to find pass or fail:");
		int mathsub = in.nextInt();
		if(mathsub <= 35) {
			System.out.println("You are fail!! Prepare well for next time");
		}else if(mathsub >= 35 && mathsub <= 50) {
			System.out.println("C Grade");
		}else if(mathsub >=50 && mathsub <= 80){
			System.out.println("B Grade");
		}else if(mathsub >=80 && mathsub <= 90){
			System.out.println("A Grade");
		}else if(mathsub >=90 && mathsub <= 100){
			System.out.println("A++ Grade");
		}
		else {
			System.out.println("Please enter marks between 0-100 only");
		}
	}

}
