package divisiblebythreeandfive;
import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// number to be check 
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = scan.nextInt();
        System.out.println(num + " is " + checkPosNeg(num)); 
	}
	
	  // Function to check positive and negative 
    static String checkPosNeg(int x) 
    { 
  
        // checks the number is greater than 0 or not 
        if (x > 0) 
            return "Positive"; 
  
        else if (x < 0) 
            return "Negative"; 
  
        else
            return "zero"; 
    } 
  
}
