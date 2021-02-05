package string;

import java.util.Scanner;

public class Vowelsconsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int i = 0, vowel = 0, consonants = 0,spaces=0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		while (i < name.length() - 1) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u' || name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I'
					|| name.charAt(i) == 'O' || name.charAt(i) == 'U') {
				vowel = vowel + 1;
			} else if (name.charAt(i)==' '){
				spaces= spaces+1;
			}
			else {
				consonants = consonants + 1;
			}
			i++;
		}
		System.out.println("Vowels : "+ vowel);
		System.out.println("Consonants : "+ consonants);
		System.out.println("spaces : "+spaces);
	}

}
