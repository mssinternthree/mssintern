package strings;
import java.util.Scanner;
class del_char_from_str{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String a=sc.nextLine();
		char[] ch=a.toCharArray();
		System.out.println("enter the character:");
		char b=sc.next().charAt(0);
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==b) {
				
				a = a.replace(ch[i]+"", ""); 
			}
		}

			System.out.println(a);
}
}