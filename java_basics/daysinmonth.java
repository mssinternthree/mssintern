import java.util.Scanner;
public class daysinmonth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your month:");
		System.out.println("1.jan 2.feb 3.march 4.apr 5.may 6.jun 7.jul 8.aug 9.sept 10.oct 11.nov 12.dec");
		int mon=sc.nextInt();
		switch(mon)
		{
		case 1:
		{
			System.out.println("31 days");
			break;
		}
		case 2:
		{
			System.out.println("28 days");
			break;
		}
		case 3:
		{
			System.out.println("31 days");
			break;
		}
		case 5:
		{
			System.out.println("31 days");
			break;
		}
		case 7:
		{
			System.out.println("31 days");
			break;
		}
		case 8:
		{
			System.out.println("31 days");
			break;
		}
		case 10:
		{
			System.out.println("31 days");
			break;
		}
		case 12:
		{
			System.out.println("31 days");
			break;
		}
		case 4:
		{
			System.out.println("30 days");
			break;
		}
		case 6:
		{
			System.out.println("30 days");
			break;
		}
		case 9:
		{
			System.out.println("30 days");
			break;
		}
		case 11:
		{
			System.out.println("30 days");
			break;
		}
		
		}
	}

}
