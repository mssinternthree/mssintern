import java.util.Scanner;
public class DigitChar {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a Character : ");
		char charinput=in.next().charAt(0);
		System.out.println("Enter a Number : ");
		int intinput=in.nextInt();
	
		System.out.printf("The Charcter is %c and Number is %d",charinput,intinput);
	}

}
