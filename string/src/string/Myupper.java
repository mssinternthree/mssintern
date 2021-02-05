package string;

import java.util.Scanner;

public class Myupper {

	static void uppercon(String s) {
		int len = s.length() - 1;
		char res = 0;
		for (int i = 0; i < s.length(); i++) {
			int aChar = (int) (s.charAt(i));
			if (122 <= aChar && aChar >= 97) {
				res = ((char) (aChar + 32));
			}

			System.out.print(res);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		uppercon(name);
	}

}
