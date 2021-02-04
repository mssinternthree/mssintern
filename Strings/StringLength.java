import java.util.Scanner;

public class StringLength {
	public static void main(String[] args) {
		CompareStrings obj=new CompareStrings();
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String stringInput=in.nextLine();
		StringBuffer stringInputFirst=new StringBuffer(stringInput);
		stringInputFirst.append("\0");
		
		int i=0;
		while(stringInputFirst.charAt(i)!='\0') {
			i++;
		}
		System.out.println("Length of the String is : "+i);
		
	}
}
