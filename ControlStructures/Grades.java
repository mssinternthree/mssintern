import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your marks : ");
		int marks=in.nextInt();
		
		if(marks>24) {
			System.out.println("Passed");
			if(marks>80) {
				System.out.println("Grade : A");
			}else if(marks>60) {
				System.out.println("Grade : B");
			}else if(marks>40) {
				System.out.println("Grade : C");
			}else {
				System.out.println("Grade : D");
			}
		}else {
			System.out.println("Failed");
		}

	}

}
