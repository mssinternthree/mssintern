import java.util.Scanner;

public class VowelsConsonents {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String stringInput=in.nextLine();
		char[] charArray=stringInput.toCharArray();
		
		int vcount=0;
		int ccount=0;
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='o'||charArray[i]=='u'||charArray[i]=='i'
					||charArray[i]=='A'||charArray[i]=='E'||charArray[i]=='I'||charArray[i]=='O'||charArray[i]=='U'
					) {
				vcount++;
			}else {
				if(charArray[i]!=' '){
					ccount++;
				}
			}
		}
		System.out.println("Total number of vowels : "+vcount);
		System.out.println("Total nnumber of consonents : "+ccount);
		
	}
}
