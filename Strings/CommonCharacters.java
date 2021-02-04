import java.util.Scanner;

public class CommonCharacters {
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
		
		char[] commCharArray=commonCharacters.toCharArray();
		
		System.out.printf("\nCommon Characters are :");
		for(int i=0;i<commCharArray.length;i++) {
			int j=0;
			for (j = 0; j < i; j++)
		         if (commCharArray[i]==commCharArray[j])
		            break;
		         if (i == j)
		        	 System.out.printf("%c",commCharArray[i]);
		     }
		}
		
	
}
