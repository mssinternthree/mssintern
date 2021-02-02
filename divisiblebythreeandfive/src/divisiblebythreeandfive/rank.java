package divisiblebythreeandfive;
import java.util.Scanner;

public class rank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your marks (max 100): ");
		int number = scan.nextInt();
		if (number>100) {
			System.out.println("Invalid Marks entered!!!");
		}
		else {
			if(number<35) {
				System.out.println("You are disqualified!!");
			}
			else if(number>35 && number <45) {
				System.out.println("You are qualified !!");
			}
			else if(number>45 && number <55) {
				System.out.println("D Grade");
			}
			else if(number>55 && number <65) {
				System.out.println("C Grade");
			}
			else if(number>65 && number <75) {
				System.out.println("B Grade");
			}
			else if(number>75 && number <85) {
				System.out.println("A Grade");
			}
			else if(number>85 && number <95) {
				System.out.println("S Grade");
			}
			else if(number >95 && number<=100) {
				System.out.println("O grade");
			}
		}

	}

}
