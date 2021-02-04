import java.util.Scanner;

public class ReplaceFirstLetter {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String stringInput=in.nextLine();
		char[] charArray=stringInput.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]==' ') {
				charArray[i+1]=(char)((int)charArray[i+1]-1);
			}
		}
		
		String[] StringArray=new String[charArray.length];
		for(int i=0;i<charArray.length;i++) {
			StringArray[i]=String.valueOf(charArray[i]);
		}
		String joinedString = String.join("", StringArray);
		System.out.println("Sorted String : "+joinedString);
	}
}
