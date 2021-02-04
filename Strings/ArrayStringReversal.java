import java.util.Scanner;

public class ArrayStringReversal {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("Enter a String :");
		String stringInputArray=in.nextLine();
		String[] arrOfStr = stringInputArray.split(" ");
		
		System.out.println("\nReversed String is :");
		for(int i=0;i<arrOfStr.length;i++) {
			for(int j=arrOfStr[i].length()-1;j>=0;j--) {
				System.out.printf("%c", arrOfStr[i].charAt(j));
			}
			System.out.printf(" ");
		}
		
	}
}
