package string;
import java.util.Scanner;
public class CharecterCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		//System.out.println("enter Char to check");
		char[] c=s1.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			int chaCount=0;
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]) {
					chaCount+=1;
				}
				
			}
			System.out.println(c[i]+":"+chaCount);
		}
		
	}

}
