package internjava;
import java.util.Scanner;
public class studentrank {
public static void main(String args[])
{
	System.out.println(" Enter student marks");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n <= 35) {
		System.out.println("Sorry u r failed");
		}
	else if(n>= 35 && n<= 50)
	{
		System.out.println("D Grade");
		}
	else if(n>=50 && n<60)
	{
		System.out.println("C Grade");
		}
	else if(n>=60 && n< 70)
	{
		System.out.println("B Grade");
		}
	else if(n>=70 && n< 80)
	{
		System.out.println("A Grade");
	}
		else if(n>=80 && n< 90)
		{
			System.out.println("S Grade");
			}
		else if(n>=90 && n<100)
		{
			System.out.println("O Grade");
		}
		else {
		System.out.println("Please enter marks between 0-100 only");
		}
  }
}
