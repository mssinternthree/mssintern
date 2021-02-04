import java.util.Scanner;

public class RemovingSpecialCharacter {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String stringInput=in.nextLine();
		
		String replacedString=stringInput.replaceAll("[^0-9A-Za-z]","");
		System.out.println("String without special charaters : "+replacedString);
		
	}
}
