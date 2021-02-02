import java.util.Scanner;
public class XandY {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter X and Y co-ordinates");
		int x = in.nextInt();
		int y = in.nextInt();
		if(x==0 && y==0) {
			System.out.println("The given co-ordinates are origin");
		}else if(x==0 && y!=0) {
			System.out.println("The given co-ordinates lies on y-axis");
		}else if(x!=0 && y==0) {
			System.out.println("The given co-ordinates lies on x-axis");
		}else {
			
				System.out.println("The given co-ordinates lies on both X and Y");
			
			}
		
	}

}
