import java.util.Scanner;

public class DeleteCharacter {
	public static void main(String...args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s1=in.nextLine(); 
		System.out.println("Enter Character to delete : ");
		char s2=in.next().charAt(0);
		String s3=String.valueOf(s2);  
		String replaceString=s1.replace(s3,"");
		System.out.println(replaceString);
	}
}
