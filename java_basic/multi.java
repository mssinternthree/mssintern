package java_day1;
import java.util.Scanner;
public class multi {
   public static void main(String[] args)
   {
	   int tab;
	   System.out.println("Enter which Table you want to display: ");
	   Scanner t = new Scanner(System.in);
	   tab = t.nextInt();
	   for(int i=0;i<=12;i++)
	   {
		   System.out.printf(tab+"*"+i+"="+tab*i+"\n");
		   
	   }
   }
}
