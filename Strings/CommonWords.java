import java.util.Scanner;

public class CommonWords {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("Enter a String :");
		String stringInputArray=in.nextLine();
		String[] arrOfStr = stringInputArray.split(" ");
		
		System.out.println("\nCommon Words are :");
//		String[] commonWords= {};
		for(int i=0;i<arrOfStr.length;i++) {
			for(int j=0;j<arrOfStr.length;j++) {
				
				if(i!=j) {
					if(arrOfStr[i].compareTo(arrOfStr[j])==0) {
						System.out.printf("%s", arrOfStr[i]);
					}
				}
				
			}
			System.out.printf(" ");
		}
		
	}
}
