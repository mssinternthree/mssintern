import java.util.Scanner; 

public class posOrNot {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		 int a;
		Scanner myObj = new Scanner(System.in);
		 a =myObj.nextInt();
		 if(a==0) {
			 System.out.println(a+"is neither +vs nor -ve"); 
		 }
		 else if(a>0) {
			 System.out.println(a +"is positive number");
		 }else {
			 System.out.println(a+"is negative number");
		 }
		
		}
}