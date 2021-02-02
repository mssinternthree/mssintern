import java.util.Scanner;
public class file6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char obj = sc.next().charAt(0); 
         int ascii = (int)obj;
		
         if(ascii>=97 && ascii<=122)
		{
		System.out.println("lowercase");
		}
		else if(ascii>=65 && ascii<=90)
		{
		System.out.println("uppercase");
		}
		else if(ascii>=48 && ascii<=57)
		{
		System.out.println("number");
		}
		else
		{
			System.out.println("special character");
		}
		
		
	}

}
