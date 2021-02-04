import java.util.Scanner;

public class CharcterWordCount {
	public static void main(String...args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String stringInput=in.nextLine();
		
		int word=0;
		int character=0;
		
		for(int i=0;i<stringInput.length();i++) {
			
			if(Character.isWhitespace(stringInput.substring(i,i+1).charAt(0))) {
				word++;
			}else {
				character++;
			}
		}
		
		System.out.println("Number of Words : "+(word+1));
		System.out.println("Number of Characters : "+character);
	}
}
