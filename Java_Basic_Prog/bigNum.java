import java.util.Scanner;
public class bigNum {
  public static void main (String args[]) {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter A and B values to find which is big");
	  int a, b;
	  a = in.nextInt();
	  b = in.nextInt();
	  if(a>b) {
		  System.out.println("A is big");
	  }else if(a<b){
		  System.out.println("B is big");
	  }else {
		  System.out.println("A and B are equal");
		  
	  }
	  
  }
}
