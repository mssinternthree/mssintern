import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String stringInput=in.nextLine();
		
		System.out.printf("Character : ");
		for(int i=stringInput.length()-1;i>=0;i--) {
			System.out.printf("%c", stringInput.charAt(i));
		}

	}

}
