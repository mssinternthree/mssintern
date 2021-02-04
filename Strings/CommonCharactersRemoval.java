import java.util.Scanner;

public class CommonCharactersRemoval {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter first String : ");
		String stringInputOne=in.nextLine();
		System.out.println("Enter second String : ");
		String stringInputTwo=in.nextLine();
		String commonCharacters="";
		
		for(int i=0;i<stringInputOne.length();i++) {
			for(int j=0;j<stringInputTwo.length();j++) {
				if(stringInputOne.charAt(i)==stringInputTwo.charAt(j)) {
					commonCharacters+=stringInputOne.charAt(i);
				}
			}
		}
		
		for(int i=0;i<commonCharacters.length();i++) {
			String charToRemove = commonCharacters.charAt(i)+"";
			stringInputOne = stringInputOne.replace(charToRemove, "");
			stringInputTwo = stringInputTwo.replace(charToRemove, "");
		}
		
		System.out.printf("\nAfter replacement, string 1 is %s and string 2 is %s",stringInputOne,stringInputTwo);
		

	}
}
