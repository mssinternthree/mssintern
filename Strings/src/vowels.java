
import java.util.Scanner;
public class vowels {
   public static void main(String args[])
   {
	   
	   Scanner obj=new Scanner(System.in);
	   System.out.println("Enter a string:");
	   String s1= obj.nextLine();
	   char c[]=s1.toCharArray();
	   char []d =new char[10];
	  // System.out.println(s1);
	   System.out.print("Vowels are ");
	   for(int i=0;i<c.length;i++)
	   {
		   if(c[i]=='A' ||c[i]=='E' ||c[i]=='I' ||c[i]=='O' ||c[i]=='U' ||c[i]=='a' ||c[i]=='e' ||c[i]=='i' ||c[i]=='o' ||c[i]=='u' ) {
			   System.out.print(c[i]);
			//   System.out.println(s1);
		   }
		   else
		   {
			  d[i]=c[i];
		   }
	   }
	   System.out.print("\nConsonants are ");
	   System.out.print(d);
   }
}
