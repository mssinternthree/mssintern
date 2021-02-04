import java.util.Scanner;

public class DetectCharacter {
	public static void main(String...args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a Character");
		char charinput=in.next().charAt(0);
		int asciiinput=charinput;
		
		if(asciiinput>=97 && asciiinput<=122) {
			System.out.println("The input is Lower Case Character");
		}else if(asciiinput>=65 && asciiinput<=90) {
			System.out.println("The input is Upper Case Character");
		}else if(asciiinput>=48 && asciiinput<=57) {
			System.out.println("The input is Numeric");
		}else {
			System.out.println("The input is a Special Character");
		}
	}
}
