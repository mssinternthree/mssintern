import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String stringInput=in.nextLine();
		char[] charArray=stringInput.toCharArray();
		char[] revArray=new char[stringInput.length()];
		int count=0;
		for(int i=charArray.length-1;i>0;i--) {
			revArray[count++]=charArray[i];
		}
		
		String[] StringArray=new String[charArray.length];
		int j=0;
		for(int i=charArray.length-1;i>=0;i--) {
			StringArray[j++]=String.valueOf(charArray[i]);
		}
		String reversedString = String.join("", StringArray);
		if(stringInput.compareTo(reversedString)==0) {
			System.out.println("The String is a palindrome");
		}else {
			System.out.println("The String is not a palindrome");
		}
		
	}
}
