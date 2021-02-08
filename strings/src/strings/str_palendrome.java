package strings;
import java.util.Scanner;
public class str_palendrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter string ");
		String str=sc.nextLine();
		char[] a=str.toCharArray();
		String rev="";
		for(int i=a.length-1;i>=0;i--)
		{
			rev+=a[i];
		}

		if(str.compareTo(rev)==0){
			System.out.println("string is palendrome");
		}
		else{
			System.out.println("string is not palendrome");
		}
	}
}