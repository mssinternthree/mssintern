package string;

import java.util.Scanner;

public class Countwordschar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		int counter =0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.printf("Your entered string = "+ name +"\n");
		/*name = name.trim();*/
		for (int i =0 ; i< name.length() ;i++) {
			if (name.charAt(i)==' ') {
				counter+=1;
		}
		}
		System.out.println("number of words = "+ (counter+1));
		
	

}
}