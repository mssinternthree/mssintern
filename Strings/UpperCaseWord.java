import java.util.Scanner;

public class UpperCaseWord {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String stringInput=in.nextLine();
		
		System.out.printf("Character : ");
		int flag=0;
		
		System.out.printf("%c", Character.toUpperCase(stringInput.charAt(0)));
		for(int i=1;i<stringInput.length();i++) {
			if(Character.isWhitespace(stringInput.charAt(i))) {
				System.out.printf(" ");
				System.out.printf("%c", Character.toUpperCase(stringInput.charAt(i+1)));
				flag=1;
			}else {
				if(flag==0) {
					System.out.printf("%c", stringInput.charAt(i));
				}else {
					flag=0;
				}
				
			}
			
		}

	}
}
