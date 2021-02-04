import java.util.Scanner;

public class ReverseSort {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String stringInput=in.nextLine();
		char charArray[] = stringInput.toCharArray();
		
		char temp;
		for(int i=0;i<stringInput.length();i++) {
			for (int j=i+1;j<stringInput.length();j++) {
				if(charArray[i]>charArray[j]) {
					temp=charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=temp;
				}
			}
		}
		String[] StringArray=new String[charArray.length];
		int j=0;
		for(int i=charArray.length-1;i>=0;i--) {
			StringArray[j++]=String.valueOf(charArray[i]);
		}
		String joinedString = String.join("", StringArray);
		System.out.println("Sorted String : "+joinedString);
		
	}
}
