package divisiblebythreeandfive;
import java.util.Scanner;
public class xyaxis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter x coordinate : ");
		int x = scan.nextInt();
		System.out.print("Enter y coordinate : ");
		int y = scan.nextInt();
		if(x==0 && y==0) {
			System.out.println("X and Y are at origin !!!");
		}
		else if(x>0 && y>0) {
			System.out.println("X and Y lies in first quadrant !!!");
		}
		else if(x<0 && y>0) {
			System.out.println("X and Y lies in second quadrant !!!");
		}
		else if(x>0 && y<0) {
			System.out.println("X and Y lies in fourth quadrant !!!");
		}
		else if(x<0 && y<0) {
			System.out.println("X and Y lies in third quadrants !!!");
		}

	}

}
