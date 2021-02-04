import java.util.Scanner;

public class CompareStrings {
	
	boolean stringCompare(String str1,String str2) {
		char charArrayOne[] = str1.toCharArray();
		char charArrayTwo[] = str2.toCharArray();
		int flag=0;
		if(charArrayOne.length==charArrayTwo.length) {
			for(int i=0;i<charArrayOne.length;i++) {
				if(charArrayOne[i]==charArrayTwo[i]) {
					flag=1;
				}else {
					flag=0;
					break;
				}
			}
		}else {
			return false;
		}
		if(flag==1) {
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		CompareStrings obj=new CompareStrings();
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String stringInputFirst=in.nextLine();
		System.out.println("Enter Second String : ");
		String stringInputSecond=in.nextLine();
		
		if(obj.stringCompare(stringInputFirst,stringInputSecond)==true) {
			System.out.println("Two Strings are equals.");
		}else {
			System.out.println("Two Strings are not equal.");
		}

	}
}
