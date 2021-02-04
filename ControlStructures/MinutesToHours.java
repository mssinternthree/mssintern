import java.util.Scanner;
public class MinutesToHours {
	public static void main(String...args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Time in Minutes : ");
		int min=in.nextInt();
		
		int hours=min/60;
		System.out.println("Time in Hours : "+hours);
	}
}
