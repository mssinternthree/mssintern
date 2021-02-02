package divisiblebythreeandfive;

import java.util.Scanner;

public class digitandcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		   System.out.println("Provide an input"); 
		   String line = in.nextLine();
		   char c = line.charAt(0);
		   if( Character.isDigit(c))
		   System.out.println(c +" Is a digit");
		   else if (Character.isLetter(c))
		   System.out.println(c +" Is a Letter");
	}

}
