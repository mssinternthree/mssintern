package strings;
import java.util.Scanner;
import java.util.Arrays;
public class alphabetic_order {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String str=sc.nextLine();
char charArray[]=str.toCharArray();
Arrays.sort(charArray);
System.out.println(new String(charArray));
}
}









