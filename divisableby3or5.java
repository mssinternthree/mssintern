import java.util.Scanner; 
public class divisableby3or5 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		if(a%3==0&&a%5==0) {
			System.out.println("yes it is divisable by both 3 and 5 ");
		}else {
			System.out.println("not");
		}
	}

}
